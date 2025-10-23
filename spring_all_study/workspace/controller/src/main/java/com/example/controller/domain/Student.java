package com.example.controller.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@Getter @Setter @ToString
public class Student {
    private String name;
    private int korean;
    private int english;
    private int math;

    public int getTotal() {
        return korean + english + math;
    }

    public double getAverage() {
        return Double.parseDouble(String.format("%.2f", getTotal() / 3.0));
    }
}