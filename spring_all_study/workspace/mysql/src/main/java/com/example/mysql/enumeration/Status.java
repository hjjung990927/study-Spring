package com.example.mysql.enumeration;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public enum Status {
    ACTIVE("active"), INACTIVE("inactive");

    private String value;
    private static final Map<String, Status> STATUS_MAP =
            Arrays.stream(Status.values())
                    .collect(Collectors.toMap(Status::getValue, Function.identity()));

    Status(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Status getStatusFromValue(String value) {
        return Optional.ofNullable(STATUS_MAP.get(value)).orElseThrow(IllegalArgumentException::new);
    }
}
// mybatis는 enum 인식 x
// mysql에서는 enum은 문자열로 저장됌
// JAVA에 있는 enum으로 바꾸려면 handler 사용
// 그래서 재정의한다.