package com.jumee.level02.normal;

import java.io.*;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        /* 여러 개의 텍스트 파일을 하나의 파일로 병합하는 프로그램을 작성한다. 이 때 BufferedReader와 BufferedWriter를 사용하여 작성한다.*/
        /*```
        병합할 파일의 개수 입력 : 3
        1 번째 파일 이름 입력 : test.txt
        2 번째 파일 이름 입력 : test2.txt
        3 번째 파일 이름 입력 : test3.txt
        병합 될 파일명 입력 : result.txt
        파일 병합이 완료 되었습니다.
        ```*/
        /*```
        병합할 파일의 개수 입력 : 2
        1 번째 파일 이름 입력 : test.txt
        2 번째 파일 이름 입력 : test4.txt
        병합 될 파일명 입력 : result.txt
        오류 : test4.txt (지정된 파일을 찾을 수 없습니다)
        ```
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("병합할 파일의 개수 입력 : ");
        int mergeFileNum = sc.nextInt();
        sc.nextLine();
        String[] toMergeFileNames = new String[mergeFileNum];
        for(int i=0; i<mergeFileNum; i++){
            System.out.print((i+1)+"번째 파일 이름 입력 :");
            toMergeFileNames[i] = sc.nextLine();
        }
        System.out.print("병합 될 파일명 입력 : ");
        String mergedFileName = sc.nextLine();

        boolean flag = true;
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(mergedFileName))) {
            for (String fileName : toMergeFileNames) {
                try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                    String value;
                    while ((value = br.readLine()) != null) {
                        bw.write(value);
                    }
                    bw.newLine();
                } catch (FileNotFoundException e) {
                    flag = false;
                    System.out.println("오류: " + fileName + " (지정된 파일을 찾을 수 없습니다.)");
                    break;
                } catch (IOException e) {
                    flag = false;
                    break;
                }
            }
            bw.flush();
            System.out.println("flush 완료");
        } catch (IOException e) {
            flag = false;
            System.out.println("파일 병합 중 오류가 발생했습니다: " + e.getMessage());
        }
        if (flag) System.out.println("파일 병합이 완료되었습니다.");
    }
}
