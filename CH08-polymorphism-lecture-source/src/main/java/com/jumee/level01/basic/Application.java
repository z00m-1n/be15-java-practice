package com.jumee.level01.basic;

public class Application {
    public static void main(String[] args) {
        ShapeManager manager = new ShapeManager();

        /* 반지름(radius) 이 5인 Circle 객체 생성 */
        Shape circle = new Circle(5);
        /* 너비(width)가 4, 높이(height)가 5인 Rectangle 객체 생성 */
        Shape rectangle = new Rectangle(4, 5);
        /* 밑변(base)이 3, 높이(height)가 4, 첫 번째 변(side1)이 3, 두 번째 변(side2)이 4, 세 번째 변(side3)이 5인 Triangle 객체 생성 */
        Shape triangle = new Triangle(3, 4, 3, 4, 5);
        Shape circle2 = new Circle(5);
        Shape rectangle2 = new Rectangle(4, 5);
        Shape triangle2 = new Triangle(3, 4, 3, 4, 5);
        Shape circle3 = new Circle(5);
        Shape rectangle3 = new Rectangle(4, 5);
        Shape triangle3 = new Triangle(3, 4, 3, 4, 5);
        Shape circle4 = new Circle(5);
        Shape rectangle4 = new Rectangle(4, 5);
        Shape triangle4 = new Triangle(3, 4, 3, 4, 5);

        /* 도형 추가 */
        manager.addShape(circle);
        manager.addShape(rectangle);
        manager.addShape(triangle);

        System.out.println("===== 모든 도형 출력 =====");
        manager.printAllShapes();
        System.out.println("총 넓이 출력 : " + manager.getTotalArea());
        System.out.println("총 둘레 출력 : " + manager.getTotalPerimeter());

        /* 크기 조정 */
        ((Resizable) circle).resize(2);
        ((Resizable) rectangle).resize(2);
        ((Resizable) triangle).resize(2);

        System.out.println("\n===== 크기 조정 후 모든 도형 출력 =====");
        manager.printAllShapes();
        System.out.println("총 넓이 출력 : " + manager.getTotalArea());
        System.out.println("총 둘레 출력 : " + manager.getTotalPerimeter());

        System.out.println("\n===== Circle 삭제 후 모든 도형 출력 =====");
        manager.removeShape(circle);
        manager.printAllShapes();
        System.out.println("총 넓이 출력 : " + manager.getTotalArea());
        System.out.println("총 둘레 출력 : " + manager.getTotalPerimeter());

        System.out.println("\n===== 배열의 크기(10)를 넘어가게 객체 삽입 =====");
        manager.addShape(circle2);
        manager.addShape(rectangle2);
        manager.addShape(triangle2);
        manager.addShape(circle3);
        manager.addShape(rectangle3);
        manager.addShape(triangle3);
        manager.addShape(circle4);
        manager.addShape(rectangle4);
        manager.addShape(triangle4);
        manager.printAllShapes();
    }
}
