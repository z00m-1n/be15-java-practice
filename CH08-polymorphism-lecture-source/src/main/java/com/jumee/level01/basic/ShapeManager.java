package com.jumee.level01.basic;

public class ShapeManager {
    private Shape[] shapes = new Shape[10];
    private int index=0;

    public void addShape(Shape shape) {
        /* 배열에 전달 된 Shape를 추가. 단, 배열의 크기가 부족할 경우 2배로 늘려서 추가. */
        if(index == shapes.length){
            System.out.println("초과됐습니다. 배열의 크기를 2배로 늘려 삽입합니다. ");
            Shape[] shapes_new = new Shape[2*shapes.length];
            for(int i=0; i<index; i++){
                shapes_new[i] = shapes[i];
            }
            shapes = shapes_new;
        }
        shapes[index ++] = shape;
    }

    public void removeShape(Shape shape) {
        /* 배열에서 전달 된 Shape를 찾아 제거. 단, 제거 된 인덱스가 비어 있지 않도록 뒤에 있는 객체를 앞으로 당김. */
        for(int i=0; i<index; i++){
            if(shapes[i] == shape){
                if(i==(index-1)) { // 마지막 Shape이면 지우고 끝
                    shapes[i] = null;
                } else { // 마지막이 아니면 앞으로 당김
                    for (int j = i; j < index - 1; j++) {
                        shapes[j] = shapes[j + 1];
                        shapes[j+1] = null;
                    }
                }
                index--;
                break;
            }
        }
    }

    public void printAllShapes() {
        /* 배열에 저장 된 모든 도형의 이름, 넓이, 둘레를 출력 */
        for(int i=0; i<index; i++){
            Shape shape = shapes[i];
            if(shape instanceof Circle){
                Circle circle = (Circle)shape;
                System.out.println("Shape : Circle");
                System.out.println("Area : " + circle.calculateArea());
                System.out.println("Perimeter : " + circle.calculatePerimeter());
            } else if (shape instanceof Rectangle) {
                Rectangle rect = (Rectangle)shape;
                System.out.println("Shape : Rectangle");
                System.out.println("Area : " + rect.calculateArea());
                System.out.println("Perimeter : " + rect.calculatePerimeter());
            } else if (shape instanceof Triangle) {
                Triangle triangle = (Triangle)shape;
                System.out.println("Shape : Triangle");
                System.out.println("Area : " + triangle.calculateArea());
                System.out.println("Perimeter : " + triangle.calculatePerimeter());
            } else{
                System.out.println("Shape : Not Defined");
                System.out.println("Area : Not Defined");
                System.out.println("Perimeter : Not Defined");
            }
            System.out.println();
        }
    }

    public double getTotalArea() {
        /* 배열에 저장 된 모든 도형의 넓이를 더해서 반환 */
        double res=0;
        for(int i=0; i<index; i++){
            Shape shape = shapes[i];
            if(shape instanceof Circle){
                Circle circle = (Circle)shape;
                res += circle.calculateArea();
            } else if (shape instanceof Rectangle) {
                Rectangle rect = (Rectangle)shape;
                res += rect.calculateArea();
            } else if (shape instanceof Triangle) {
                Triangle triangle = (Triangle)shape;
                res += triangle.calculateArea();
            } else{
                continue;
            }
        }
        return res;
    }

    public double getTotalPerimeter() {
        /* 배열에 저장 된 모든 도형의 둘레를 더해서 반환 */
        double res=0;
        for(Shape shape : shapes){
            if(shape instanceof Circle){
                Circle circle = (Circle)shape;
                res += circle.calculatePerimeter();
            } else if (shape instanceof Rectangle) {
                Rectangle rect = (Rectangle)shape;
                res += rect.calculatePerimeter();
            } else if (shape instanceof Triangle) {
                Triangle triangle = (Triangle)shape;
                res += triangle.calculatePerimeter();
            } else{
                continue;
            }
        }
        return res;
    }
}
