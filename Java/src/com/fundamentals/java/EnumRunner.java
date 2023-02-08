package com.fundamentals.java;

import java.util.Arrays;

enum Season{
    SPRING(1),SUMMER(2),RAINY_SEASON(3),AUTUMN(4),WINTER(5);
    private int i;

    Season(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }
}
public class EnumRunner {
    public static void main(String[] args){
        Season season=Season.AUTUMN;
        Season season1=Season.valueOf("SUMMER");
        System.out.println(season);
        System.out.println(Season.SPRING.ordinal());
        System.out.println(Season.AUTUMN.getI());
        System.out.println(Arrays.toString(Season.values()));
    }
}
