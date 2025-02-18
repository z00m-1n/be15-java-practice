package com.jumee.level01.basic;

public class Calculator {
    public void checkMethod(){
        // 함수 호출 확인용 메소드
        System.out.println("메소드 호출 확인");
    }

    public int sum1to100() {
        // 1부터 10까지 수를 더하여 값을 리턴함
        int sum = 0;
        for(int i=1 ; i<11 ; i++) {
            sum += i;
        }
        return sum;
    }

    public void checkMaxNumber(int a, int b) {
        // 두 수를 입력받아 큰 수를 출력함
        System.out.println("두 수 중 큰 수는 " + ((a > b) ? a : b) + "이다.");

    }

    public int sumTwoNumber(int a, int b) {
        // 두 수를 입력받아 합을 리턴함
        return a+b;
    }

    public int minusTwoNumber(int a, int b) {
        // 두 수를 입력받아 차를 리턴함
        return (a>b) ? a-b : b-a;
    }
}
