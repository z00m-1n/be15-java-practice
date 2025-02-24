package com.jumee.level01.basic;

public class Triangle extends Shape implements Resizable{
    private double base;   //밑변
    private double height; //높이
    private double side1;  //변1
    private double side2;  //변2
    private double side3;  //변3

    /*생성자*/
    public Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public void resize(double factor) {
        base *= factor;
        height *= factor;
        side1 *= factor;
        side2 *= factor;
        side3 *= factor;
    }

    @Override
    double calculateArea() {
        return (double) (base * height) / 2;
    }

    @Override
    double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}
