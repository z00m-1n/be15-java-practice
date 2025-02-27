package com.jumee.level01.basic;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Application6 {
    public static void main(String[] args) {
        // 전화번호부
        /*이름을 입력하면 전화번호를 검색할 수 있도록 전화번호부를 구현하세요.*/
        /*
        이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): 홍길동010-1234-5678
        입력이 잘못 되었습니다. 다음 양식으로 입력해주세요 : <이름> <전화번호>
        이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): 홍길동 010-1234-5678
        추가 완료 : 홍길동 010-1234-5678
        이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): 유관순 010-9876-5432
        추가 완료 : 유관순 010-9876-5432
        이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): search
        검색 할 이름 : 유관순
        유관순씨의 전화번호 : 010-9876-5432
        이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): search
        검색 할 이름 : 이순신
        이순신씨의 번호는 등록 되어 있지 않습니다.
        이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): exit*/
        Scanner sc = new Scanner(System.in);
        Map<String, String> phoneBook = new TreeMap<>();
        while(true){
            System.out.print("이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): ");
            String nameAndPhone = sc.nextLine();
            if(nameAndPhone.equals("exit")){
                break;
            } else if(nameAndPhone.equals("search")){
                System.out.print("검색할 이름:");
                String searchName = sc.nextLine();
                if(phoneBook.get(searchName)!=null){
                    System.out.println(searchName+"씨의 전화번호 : "+phoneBook.get(searchName));
                } else {
                    System.out.println(searchName+"씨의 번호는 등록 되어 있지 않습니다.");
                }
            } else{
                String[] nameAndPhoneSplited = nameAndPhone.split(" ");
                if (nameAndPhoneSplited.length != 2) {
                    System.out.println("입력이 잘못 되었습니다. 다음 양식으로 입력해주세요 : <이름> <전화번호>");
                } else {
                    phoneBook.put(nameAndPhoneSplited[0], nameAndPhoneSplited[1]);
                    System.out.println("추가 완료 : " + nameAndPhoneSplited[0] + " " + nameAndPhoneSplited[1]);
                }
            }
        }
    }
}
