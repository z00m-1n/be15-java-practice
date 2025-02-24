package com.jumee.level01.basic;

public class Rectangle extends Shape implements Resizable{
    private double width;
    private double height;

    /* 생성자 */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void resize(double factor) {
        width *= factor;
        height *= factor;
    }

    @Override
    double calculateArea() {
        return width * height;
    }

    @Override
    double calculatePerimeter() {
        return 2*(width + height);
    }
}
