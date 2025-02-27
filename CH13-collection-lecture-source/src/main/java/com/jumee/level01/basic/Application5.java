package com.jumee.level01.basic;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Application5 {
    public static void main(String[] args) {
        //사전순 단어 정렬
        /*사용자가 입력한 단어들을 사전순으로 정렬한 후 출력하는 프로그램을 작성하세요.*/
        /*단어 입력 ('exit' 입력 시 종료): 안녕
        단어 입력 ('exit' 입력 시 종료): java
        단어 입력 ('exit' 입력 시 종료): collection
        단어 입력 ('exit' 입력 시 종료): 프로그래밍
        단어 입력 ('exit' 입력 시 종료): exit
        정렬 된 단어 : [collection, java, 안녕, 프로그래밍]*/
        Scanner sc = new Scanner(System.in);
        Set<String> dict = new TreeSet<>();
        while(true){
            System.out.print("단어 입력 ('exit' 입력 시 종료): ");
            String word = sc.nextLine();
            if(word.equals("exit")){
                break;
            } else {
                dict.add(word);
            }
        }
        System.out.println("정렬 된 단어 : "+dict);


    }
}
