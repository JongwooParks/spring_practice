package com.example.ex00.qualifier;

import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("outback")
@ToString
@Getter
public class Outback implements Restaurant{
    int steakPrice = Restaurant.steakPrice -10000;

    @Override
    public boolean canUseSelfBar() {
        return false;
    }

    public int getSteak(){
        return steakPrice-5000;
    }



}
