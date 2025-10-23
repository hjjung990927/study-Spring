package com.example.threetier.audit;

import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter @ToString
@SuperBuilder
public class Period {
    private String createdDatetime;
    private String updatedDatetime;
}
