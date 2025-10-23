package com.example.mysql.domain;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Getter @ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class TestVO {
    private String name;
    private int age;

//    private TestVO(Builder builder) {
//        this.name = builder.name;
//        this.age = builder.age;;
//    }

//    내부클래스: 클래스 안에 클래스
//    public static class Builder{
//        private String name;
//        private int age;
//
//        public Builder name(String name) {
//            this.name = name;
//            return this;
//        }
//
//        public Builder age(int age) {
//            this.age = age;
//            return this;
//        }
//
//        public TestVO build() {
//            return new TestVO(this);
//        }
//    }
}

// Builder를 쓰는 이유
// 장점: 필드를 빼먹고 안쓸 수 없다, 반드시 모든 필드를 초기화해야 빌드가 된다.
// VO를 불변으로 만들 수 있다.
