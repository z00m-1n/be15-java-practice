package com.jumee.level01.basic;

public class Circle extends Shape implements Resizable{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void resize(double factor) {
        radius *= factor;
    }

    @Override
    double calculateArea() {
        return radius * radius * 3.141592;
    }

    @Override
    double calculatePerimeter() {
        return 2 * radius * 3.141592;
    }
}
