package com.replcodes;

public class Homework2 {
    public static void main(String[] args) {
        Square square = new Square(23,57);
        square.getLength(24);
        square.getWidth(56);

        System.out.println(square);


        Circle circle = new Circle(4,8);
        circle.getRadius(5);
        circle.getCircumference(10);

        System.out.println(circle);


        Triangle triangle = new Triangle(9, 15);
        triangle.getHeight(11);
        triangle.getBase(13);

        System.out.println(triangle);


        Song song = new Song("title","artist");
        song.titleAndArtist();

        System.out.println(song);

        Car car = new Car(4,8);
        car.actualWindows();

        System.out.println(car);
    }
}