package com.example.dependency.qualifier;

import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Getter @ToString
@Qualifier("vips")
public class Vips implements Restaurant {
    private int steakPrice;

    public Vips() {
        this.steakPrice = Restaurant.steakPrice - 10000;
    }

    @Override
    public boolean selfBar() {
        return true;
    }
}
