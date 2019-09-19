package com.replcodes;

public class Square {
    private double length;
    private double width;

    public Square(double length, double width){
        this.length=length;
        this.width=width;
    }

    public double getLength(double length) {
        return length;
    }

    public double getWidth(double width) {
        return width;
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}