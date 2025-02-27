package com.jumee.level01.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        /* 점수 평균 구하기
        학생들의 점수를 입력받아 저장한 후, 평균 점수를 계산하여 출력하는 프로그램을 작성하세요.*/
        /*
        학생 성적 : 100
        추가 입력하려면 y : y
        학생 성적 : 95
        추가 입력하려면 y : Y
        학생 성적 : 66
        추가 입력하려면 y : y
        학생 성적 : 79
        추가 입력하려면 y : n
        학생 인원 : 4
        평균 점수 : 85.0
        */

        // Array 사용 없이
//        Scanner sc = new Scanner(System.in);
//        int studentNum = 1;
//        double totalGrade = 0;
//        while(true){
//            System.out.print("학생 성적 : ");
//            totalGrade += sc.nextDouble();
//            System.out.print("추가 입력하려면 y : ");
//            char yORn = sc.next().charAt(0);
//            if(yORn != 'y' && yORn!='Y') break;
//            studentNum ++;
//        }
//
//        System.out.println("학생 인원 : "+studentNum);
//        System.out.println("평균 점수 : "+totalGrade/studentNum);


        // Array 사용해서
        Scanner sc = new Scanner(System.in);
        List<Integer> students = new ArrayList<>();
        while(true){
            System.out.print("학생 성적 : ");
            students.add(sc.nextInt());
            System.out.print("추가 입력하려면 y : ");
            char yORn = sc.next().charAt(0);
            if(yORn != 'y' && yORn!='Y') break;
        }
        int totalGrade = 0;
        for(int std : students){
            totalGrade += std;
        }
        System.out.println("학생 인원 : "+students.size());
        System.out.println("평균 점수 : "+(double)totalGrade/students.size());



    }
}
