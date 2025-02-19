package com.jumee.section02.looping.level03.hard;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        /* 2보다 큰 정수를 하나 입력 받아 그 수가 소수인지 아닌지를 판별해서 출력하세요
         * 소수인 경우 "소수다." 출력, 소수가 아닌 경우 "소수가 아니다." 출력
         *
         * 단, 2보다 큰 정수가 아닌 경우 "잘못 입력하셨습니다. 다시 입력하세요." 라고 출력 후
         * 정수를 다시 입력 받을 수 있도록 한다.
         *
         * 소수란?
         * 어떤 수를 1부터 자기 자신까지 차례대로 나누었을 때
         * 나누어 떨어지는 수가 1과 자기 자신만 존재하는 수를 소수라고 한다.
         */
         /* -- 입력 예시 --
         * 2보다 큰 정수를 하나 입력하세요 : 7
         *
         * -- 출력 예시 --
         * 소수다.
         * */
        Scanner sc = new Scanner(System.in);
        int num;
        while(true){
            System.out.print("2보다 큰 정수를 하나 입력하세요 : ");
            num = sc.nextInt();
            if(num > 2) break;
            System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
        }

        // 소수 확인 연산 (나머지가 0인 게 하나라도 있으면 소수 아님)
        int i;
        for(i=2; i<=num; i++) {
            if(num%i == 0) break;
        }

        // 결과문 출력
        if(i == num) {
            System.out.println("소수다.");
        } else{
            System.out.println("소수가 아니다. ("+i+"의 배수)");
        }
    }
}
