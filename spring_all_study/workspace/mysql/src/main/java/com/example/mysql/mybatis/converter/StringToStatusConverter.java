package com.example.mysql.mybatis.converter;

import com.example.mysql.enumeration.Status;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class StringToStatusConverter implements Converter<String, Status> {
    @Override
    public Status convert(String source) {
        return Status.getStatusFromValue(source);
//        Function.identity(), 항등 함수: (e) => e
//        Map<String, Status> STATUS_MAP = Stream.of(Status.values()).collect(Collectors.toMap(Status::getValue, Function.identity()));
//        return STATUS_MAP.get(source);
    }
}

// 만약 문자열 파라미터가 들어왔다 status를 문자열로 바꿔주겠다
// 기존 status는 enum이기에 객체 다 가져오고 MAP으로 바꾼다
// 문자열을 KEY 값으로 주고 enum 을 Value로 준다
// enum 객체의 getValue는 문자열
