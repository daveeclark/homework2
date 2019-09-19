package com.replcodes;

public class Circle {
    public double radius;
    public double circumference;

    public Circle(double radius, double circumference){
        this.radius=radius;
        this.circumference=circumference;
    }

    public double getRadius(double radius) {
        return radius;
    }

    public double getCircumference(double circumference) {
        return circumference;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", circumference=" + circumference +
                '}';
    }
}
