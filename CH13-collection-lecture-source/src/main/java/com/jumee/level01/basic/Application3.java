package com.jumee.level01.basic;

import java.util.*;

public class Application3 {
    public static void main(String[] args) {
        //대기 줄 시뮬레이션
        /*대기 줄을 시뮬레이션하는 프로그램을 작성하세요. 고객이 줄을 서면 대기열에 추가되고, 서비스가 완료되면 대기열에서 제거합니다.*/
        /*대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): 유관순
        유관순 고객님 대기 등록 되었습니다.
        대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): 홍길동
        홍길동 고객님 대기 등록 되었습니다.
        대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): next
        유관순 고객님 차례입니다.
        대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): 신사임당
        신사임당 고객님 대기 등록 되었습니다.
        대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): next
        홍길동 고객님 차례입니다.
        대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): next
        신사임당 고객님 차례입니다.
        대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): next
        대기 고객이 없습니다.
        대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): exit*/
        Scanner sc = new Scanner(System.in);
        Queue<String> waitingLine = new LinkedList<>();
        while(true) {
            System.out.print("대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): ");
            String customer = sc.nextLine();
            if(customer.equals("next")){
                if(waitingLine.size() <= 0){
                    System.out.println("대기 고객이 없습니다.");
                } else{
                    System.out.println(waitingLine.poll()+"고객님 차례입니다.");
                }
            } else if(customer.equals("exit")){
                break;
            } else{
                waitingLine.add(customer);
                System.out.println(customer+"고객님 대기 등록되었습니다.");
            }
        }
    }
}
