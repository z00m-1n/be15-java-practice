package com.jumee.level1.basic;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {
        /* 생년월일을 입력 받아 만 20세 미만일 경우
         * InvalidAgeException이라는 사용자 정의 예외를 발생시키는 프로그램을 작성한다.*/
        /* ----- 입력 예시 -----
         *
         * 생년월일 입력 (yyyy-MM-dd 양식으로 작성) : 2014-05-05
         *
         * ----- 출력 예시 -----
         *
         * 만 20세 미만은 입장 불가입니다.
         */
         /* ----- 입력 예시 -----
         *
         * 생년월일 입력 (yyyy-MM-dd 양식으로 작성) : 1994-05-05
         *
         * ----- 출력 예시 -----
         *
         * 입장하셔도 됩니다.
         */
         /* ----- 입력 예시 -----
         *
         * 생년월일 입력 (yyyy-MM-dd 양식으로 작성) : 2000-14-15
         *
         * ----- 출력 예시 -----
         *
         * 날짜 양식을 잘못 입력하셨습니다.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("생년월일 입력 (yyyy-MM-dd 양식으로 작성) : ");
        String str = sc.nextLine();
        //    System.out.println("Pattern = " + LocalDate.parse(dateNow, DateTimeFormatter.ofPattern("yyMMdd")));

        LocalDate birthDate;
        try{
            birthDate = LocalDate.parse(str, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            LocalDate twenty = birthDate.plusYears(20);
            LocalDate dateNow = LocalDate.now();

            if(dateNow.isBefore(birthDate)){
                System.out.println("만 20세 미만은 입장 불가입니다.");
            } else {
                System.out.println("입장하셔도 됩니다.");
            }
        } catch(DateTimeException e){
            System.out.println("날짜 양식을 잘못 입력하셨습니다.");
        } finally {
            sc.close();
        }

    }
}
