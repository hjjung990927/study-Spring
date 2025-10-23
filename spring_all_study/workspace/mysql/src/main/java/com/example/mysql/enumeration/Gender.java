package com.example.mysql.enumeration;

import lombok.Getter;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@Getter
public enum Gender {
    MAN("man"), WOMAN("woman"), NONE("선택안함");
//    Gender enum은 MAN, WOMAN, NONE 이라는 옵션 정의

    private String value;
//    각각에 대한 실제 값

    private static final Map<String, Gender> GENDER_MAP =
            Arrays.stream(Gender.values())
                    .collect(Collectors.toMap(Gender::getValue, Function.identity()));
//    GENDER_MAP: Gender 값을 키(값에 접근하기 위한 이름) - 값(저장된 데이터) 저장한 Map
//    Arrays.stream(Gender.values()): enum의 모든 값을 배열로 반환 후 Stream(배열 반복 처리)으로 변환
//    Collectors.toMap(키 만드는 함수, 값 만드는 함수): Stream에 나온 데이터를 Map에 모아주는 역할
//    Gender::getValue: 각 enum 값에서 key를 뽑는다.
//    Function.identity(): Stream 요소(Gender enum 값)를 value로 사용

    Gender(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Gender getGenderFromValue(String value) {
        return Optional.ofNullable(GENDER_MAP.get(value))
                .orElseThrow(IllegalArgumentException::new);
    }
//    Optional: 값이 있을 수도, 없을 수도 있음을 안전하게 처리
//    GENDER_MAP.get(value)가 null일 수 있으니 Optional.ofNullable()로 감싸서 처리
}
