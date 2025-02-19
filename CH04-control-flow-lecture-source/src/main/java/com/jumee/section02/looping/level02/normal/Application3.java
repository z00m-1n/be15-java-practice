package com.jumee.section02.looping.level02.normal;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        /* 정수를 입력받아 1부터 입력받은 정수까지
         * 홀수이면 "수", 짝수이면 "박"이 정수만큼 누적되어 출력되게 작성하시오.
         *
         * -- 입력 예시 --
         * 정수를 입력하세요 : 5
         *
         * -- 출력 예시 --
         * 수박수박수
         * */

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();

        // 풀이 1 :  String 내장 함수 repeat 사용
        System.out.print("수박".repeat(num/2));
        if(num%2 == 1){
            System.out.println("수");
        }

        // 풀이 2 : 반복문 사용-1
        for(int i = 0; i<num/2; i++) {
            System.out.print("수박");
        }
        if(num%2 == 1){
            System.out.println("수");
        }
    }
}
