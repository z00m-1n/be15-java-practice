package com.jumee.level01.basic.student.run;

import com.jumee.level01.basic.student.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        StudentDTO[] students = new StudentDTO[10];
        Scanner sc = new Scanner(System.in);

        int idx = 0;
        while(true){
            students[idx] = new StudentDTO();
            System.out.print("학년 : ");
            students[idx].setGrade(sc.nextInt());
            System.out.print("반 : ");
            students[idx].setClassroom(sc.nextInt());
            System.out.print("이름 : ");
            students[idx].setName(sc.next());
            System.out.print("국어점수 : ");
            students[idx].setKor(sc.nextInt());
            System.out.print("영어점수 : ");
            students[idx].setEng(sc.nextInt());
            System.out.print("수학점수 : ");
            students[idx].setMath(sc.nextInt());
            System.out.print("계속 추가할 겁니까? (y/n) : ");
            char flag = sc.next().charAt(0);

            if(flag =='y' || flag =='Y' ){
                idx++;
                if(idx==10) {
                    idx--;
                    System.out.println("10명의 학생 정보를 모두 입력받았습니다. 입력을 종료합니다.");
                    break;
                }
                continue;
            } else if (flag =='n' || flag =='N' ) {
                break;
            } else {
                System.out.println("y 또는 n이 아닙니다. 입력을 종료합니다. ");
            }
        } // 입력 while 종료

        for(int i=0; i<=idx; i++){
            System.out.println(students[i].getInformation());
        }
    }
}
