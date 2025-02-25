package com.jumee.level01.basic;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        /* 사용자로부터 파일 이름을 입력받아 해당 파일을 읽고 내용을 출력하는 프로그램을 작성한다.
         * 파일이 존재하지 않을 경우에 대해 예외를 처리한다.*/
        /* ----- 입력 예시 -----
         *
         * (존재하는 파일명을 입력한 경우)
         * 파일 이름을 입력하세요 : hello.txt
         *
         * ----- 출력 예시 -----
         *
         * ===== 파일 내용 출력 =====
         * 안녕하세요. 반갑습니다. 제 이름은 홍길동입니다.
         */
         /* ----- 입력 예시 -----
         *
         * (존재하지 않는 파일명을 입력한 경우)
         * 파일 이름을 입력하세요 : unknown.txt
         *
         * ----- 출력 예시 -----
         *
         * 오류 : 해당 이름을 가진 파일이 없습니다.
         *
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("파일 이름을 입력하세요 : ");
        String name = sc.nextLine();

        try(FileReader fr = new FileReader(name)) {
            int value;
            while((value = fr.read()) != -1){
                System.out.print((char)value);
            }

        } catch (IOException e) {
            System.out.println("오류 : 해당 이름을 가진 파일이 없습니다.");
        }


    }
}
