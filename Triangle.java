package com.replcodes;

public class Triangle {
    public double height;
    public double base;

    public Triangle(double height, double base){
        this.height=height;
        this.base=base;
    }

    public double getHeight(double height) {
        return height;
    }

    public double getBase(double base) {
        return base;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", base=" + base +
                '}';
    }
}
