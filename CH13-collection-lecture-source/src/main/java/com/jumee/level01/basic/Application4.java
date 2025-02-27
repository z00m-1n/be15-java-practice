package com.jumee.level01.basic;

import java.util.HashSet;
import java.util.Scanner;

public class Application4 {
    public static void main(String[] args) {
        //학생 ID 관리
        /*학생들의 ID를 관리하는 프로그램을 작성하세요. 이미 존재하는 ID는 추가하지 않으며, 전체 학생 ID를 출력합니다.*/
        /*학생 ID 입력('exit' 입력 시 종료): hello
        ID가 추가 되었습니다.
        학생 ID 입력('exit' 입력 시 종료): java
        ID가 추가 되었습니다.
        학생 ID 입력('exit' 입력 시 종료): programmer
        ID가 추가 되었습니다.
        학생 ID 입력('exit' 입력 시 종료): java
        이미 등록 된 ID입니다.
        학생 ID 입력('exit' 입력 시 종료): exit
        모든 학생의 ID : [java, programmer, hello]*/
        Scanner sc = new Scanner(System.in);
        HashSet<String> stuID = new HashSet<>();
        while(true) {
            System.out.print("학생 ID 입력('exit' 입력 시 종료) : ");
            String newID = sc.nextLine();
            if(newID.equals("exit")){
                break;
            } else if (stuID.contains(newID)){
                System.out.println("이미 등록 된 ID 입니다.");
            } else{
                stuID.add(newID);
                System.out.println("ID가 추가 되었습니다.");
            }
        }
        System.out.println("모든 학생의 ID : "+stuID);
    }
}
