package com.example.mysql.mybatis.converter;

import com.example.mysql.enumeration.Gender;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToGenderConverter implements Converter<String, Gender> {
    @Override
    public Gender convert(String source) {
        return Gender.getGenderFromValue(source);
    }
}
