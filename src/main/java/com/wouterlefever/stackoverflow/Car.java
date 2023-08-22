package com.wouterlefever.stackoverflow;

public class Car {
    private final String id;

    public Car(String id) {
        this.id = id;
    }

    public static int getNumberOfTiresStatic(){
        return 4;
    }

    public int getNumberOfTires(){
        return getNumberOfTiresStatic();
    }
}
