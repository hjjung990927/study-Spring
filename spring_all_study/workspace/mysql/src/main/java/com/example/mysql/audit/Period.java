package com.example.mysql.audit;

import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter @ToString
@SuperBuilder
public abstract class Period {
    private String createdDate;
    private String updatedDate;
}
// 단독으로 쓰지 않아 class 앞에 abstract