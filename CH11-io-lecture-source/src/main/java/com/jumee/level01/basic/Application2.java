package com.jumee.level01.basic;

import java.io.*;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        /* 사용자로부터 입력받은 파일의 내용을 읽어 새로운 파일에 복사하는 프로그램을 작성한다.
         * 원본 파일이 존재하지 않을 경우에 대한 예외를 처리한다.
         */
        /* ----- 입력 예시 -----
         *
         * (원본 파일이 존재 하는 경우)
         * 원본 파일의 이름을 입력하세요 : origin.txt
         * 복사 파일의 이름을 입력하세요 : copy.txt
         *
         * ----- 출력 예시 -----
         *
         * 파일 복사가 성공적으로 완료 되었습니다.
         */
         /* ----- 입력 예시 -----
         *
         * (원본 파일이 존재하지 않는 경우)
         * 원본 파일의 이름을 입력하세요 : origin2.txt
         * 복사 파일의 이름을 입력하세요 : copy2.txt
         *
         * ----- 출력 예시 -----
         *
         * 오류 : origin2.txt (지정된 파일을 찾을 수 없습니다)
         *
         */
        // FileNotFoundException
        Scanner sc = new Scanner(System.in);
        System.out.print("원본 파일의 이름을 입력하세요 : ");
        String originFile = sc.nextLine();
        System.out.print("복사 파일의 이름을 입력하세요 : ");
        String copyFile = sc.nextLine();

        FileReader fr = null;
        FileWriter fw = null;
        try{
            File file = new File(originFile);
            fr = new FileReader(file);
            fw = new FileWriter(copyFile, true);

            int value = 0;
            while ((value = fr.read()) != -1) {
                char ch = (char)value;
                fw.write(ch);
            }
            fw.flush();
            System.out.println("파일 복사가 성공적으로 완료 되었습니다.");
        } catch(FileNotFoundException e){
            System.out.println("오류 : "+originFile+" (지정된 파일을 찾을 수 없습니다)");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fr.close();
                fw.close();
            } catch (IOException | NullPointerException e) {
//                System.out.println("close exception");
            }
        }
    }
}
