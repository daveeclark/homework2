package com.replcodes;

public class Car {
    public int wheels;
    private int windows;

    public Car(int wheels, int windows){
        this.wheels=wheels;
        this.windows=windows;
    }

    private int numOfWindows(int windows){
        return windows;
    }

    public void actualWindows(){
        System.out.println(numOfWindows(5));
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + wheels +
                ", windows=" + windows +
                '}';
    }
}
