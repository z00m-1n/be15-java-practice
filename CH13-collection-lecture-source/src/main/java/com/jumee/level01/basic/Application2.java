package com.jumee.level01.basic;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Application2 {
    public static void main(String[] args) {
        /*최근 방문한 URL 기록*/
        /*사용자가 방문한 웹사이트 URL을 입력받아 저장하고, 가장 최근에 방문한 5개의 URL을 출력하는 프로그램을 작성하세요.*/
        /*방문 URL을 입력하세요 (단, exit를 입력하면 종료) : https://www.google.com/
        최근 방문 url : [https://www.google.com/]
        방문 URL을 입력하세요 (단, exit를 입력하면 종료) : https://github.com/
        최근 방문 url : [https://github.com/, https://www.google.com/]
        방문 URL을 입력하세요 (단, exit를 입력하면 종료) : https://www.notion.so/
        최근 방문 url : [https://www.notion.so/, https://github.com/, https://www.google.com/]
        방문 URL을 입력하세요 (단, exit를 입력하면 종료) : https://www.naver.com/
        최근 방문 url : [https://www.naver.com/, https://www.notion.so/, https://github.com/, https://www.google.com/]
        방문 URL을 입력하세요 (단, exit를 입력하면 종료) : https://github.com/
        최근 방문 url : [https://github.com/, https://www.naver.com/, https://www.notion.so/, https://github.com/, https://www.google.com/]
        방문 URL을 입력하세요 (단, exit를 입력하면 종료) : https://www.google.com/
        최근 방문 url : [https://www.google.com/, https://github.com/, https://www.naver.com/, https://www.notion.so/, https://github.com/]
        방문 URL을 입력하세요 (단, exit를 입력하면 종료) : exit*/
        Scanner sc = new Scanner(System.in);

        LinkedList<String> urls = new LinkedList<>();

        while(true){
            System.out.print("방문 URL을 입력하세요(단, exit를 입력하면 종료) : ");
            String url = sc.nextLine();
            if(url.equals("exit")) break;
            urls.addFirst(url);

            if(urls.size() > 5) urls.removeLast();
            System.out.println("최근 방문 url : "+urls);
        }
    }
}
