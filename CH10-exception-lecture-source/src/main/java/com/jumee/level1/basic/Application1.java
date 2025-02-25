package com.jumee.level1.basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        /* 사용자로부터 두 개의 정수를 입력 받아 나눗셈을 수행하는 프로그램을 작성한다.
         * 정수가 아닌 값을 입력 받을 경우와 나누는 수가 0일 경우의 exception을 각각 처리하고,
         * 마지막에는 항상 실행되는 메시지를 출력한다. */
        /* ----- 입력 예시 -----
         *
         * 분자 입력 : 10
         * 분모 입력 : 2
         *
         * ----- 출력 예시 -----
         *
         * 결과 : 5
         * 실행이 완료되었습니다.
         */
        /* ----- 입력 예시 -----
         *
         * 분자 입력 : 십
         *
         * ----- 출력 예시 -----
         *
         * 오류 : 유효한 정수를 입력하세요.
         * 실행이 완료되었습니다.
         */
        /* ----- 입력 예시 -----
         *
         * 분자 입력 : 10
         * 분모 입력 : 0
         *
         * ----- 출력 예시 -----
         *
         * 오류 : 0으로 나누는 것은 허용되지 않습니다.
         * 실행이 완료되었습니다.
         */
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("분자 입력 : ");
            int numerator = sc.nextInt();
            System.out.print("분모 입력 : ");
            int denominator = sc.nextInt();

            System.out.println("결과 : "+(numerator/denominator));
        } catch(InputMismatchException e){
            System.out.println("오류 : 유효한 정수를 입력하세요.");
        } catch(ArithmeticException e){
            System.out.println("오류 : 0으로 나누는 것은 허용되지 않습니다.");
        }finally {
            System.out.println("실행이 완료되었습니다.");
            sc.close();
        }





    }
}
