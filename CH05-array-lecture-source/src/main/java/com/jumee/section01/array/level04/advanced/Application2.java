package com.jumee.section01.array.level04.advanced;

import java.util.Random;
import java.util.Scanner;

public class Application2 {
    static Random rand = new Random();

    public static boolean isMultiple(int[] arr, int index, int val){
        for(int i=0; i<index; i++){
            if (arr[i] == val) return false;
        }
        return true;
    }

    public static void makeArray(int[] arr){
        for(int i=0; i<arr.length; i++){

            boolean isMultiple = false;
            while(!isMultiple){
                int newRand = rand.nextInt(9);
                arr[i] = newRand;
                isMultiple = isMultiple(arr, i, newRand);
            }
        }
    }

    public static void main(String[] args) {
        /* 숫자 야구게임 만들기
         * 길이 4의 정수 배열을 만들고 각 인덱스에는 0 ~ 9까지의 중복되지 않는 난수를 저장한다.
         * 4자리 숫자를 입력받아 스트라이크, 볼 등의 힌트를 주며 4자리 난수 숫자를 맞추는 게임이다.
         * 숫자와 자리가 모두 맞는 경우 스트라이크, 숫자는 맞지만 자리는 맞지 않는 경우는 볼 이다.
         * 예) 9183 으로 난수가 발생하면 9356 입력 시 1S 1B이다.
         *
         * 단, 기회는 총 10번이며, 10번 이내에 맞추는 경우 "정답입니다." 출력 후 게임 종료
         * 10번의 기회가 모두 소진 되면 "10번의 기회를 모두 소진하셨습니다. 프로그램을 종료합니다." 출력 후 종료
         *
         * 또한 4자리의 정수를 입력하지 않은 경우에는 "4자리의 정수를 입력해야 합니다." 출력 후 입력을 다시 받을 수 있되
         * 횟수는 차감하지 않는다.
         */
         /* -- 프로그램 예시 (난수 7416 의 경우) --
         *
         * 10회 남으셨습니다.
         * 4자리 숫자를 입력하세요 : 1234
         * 아쉽네요 0S 2B 입니다.
         * 9회 남으셨습니다.
         * 4자리 숫자를 입력하세요 : 5678
         * 아쉽네요 0S 2B 입니다.
         * 8회 남으셨습니다.
         * 4자리 숫자를 입력하세요 : 7416
         * 정답입니다.
         * */
        /* 추후 발전 시킬 내용 :
        * 1. 입력받은 4자리 숫자에 대한 검증 처리. 4자리인지, 모두 숫자인지, 0~9짜리의 숫자가 중복 없이 들어갔는지의 검증이 모두 들어가야 함.*/

        // 정답 배열 ans 생성
        int[] ans = new int[4];
        makeArray(ans);
        int ansToNum = 1000*ans[0] + 100*ans[1] + 10*ans[2] + ans[3];

        // 입력받은 정수 배열 arr 생성
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for(int life = 10; life>=1; life--){
            System.out.println(life+"회 남으셨습니다.");
            System.out.print("4자리 숫자를 입력하세요: ");
            int inputNum = sc.nextInt();

            // 4자리수 확인
            if(Integer.toString(inputNum).length() !=4){
                System.out.println("4자리의 정수를 입력해야 합니다.");
                continue;
            }

            // 정답이면 먼저 break
            if(inputNum == ansToNum) {
                System.out.println("정답입니다.");
                break;
            }

            int ball=0, strike=0;
            // 입력받은 네 자리 숫자에 대한 처리
            for(int i=3; i>=0; i--){
                // 입력된 네자리 숫자에 대해, 4개의 한 자리수 정수를 추출해서 배열에 입력
                int arrNum = inputNum/((int)Math.pow(10, i));
                arr[3-i] = arrNum;
//                System.out.println(" &&& arr["+(3-i)+"] = "+arrNum +" &&&");
                inputNum %= (int)Math.pow(10, i);

                // 배열에 입력함과 동시에 strike, ball 여부 확인
                if(ans[3-i] == arr[3-i]){
                    strike++;
                }else if(!isMultiple(ans,4, arrNum)){
                    ball++;
                } else {
                    continue;
                }
//                System.out.println("       지금의 strike: "+strike+", ball: "+ball);
            }

            // ball, strike 출력
            System.out.println("아쉽네요 "+strike+"S "+ball+"B 입니다.");

            if(life == 0) System.out.println("10번의 기회를 모두 소진하셨습니다. 프로그램을 종료합니다.");
        }// life회 남으셨습니다 알려주는 for문 종료
    }
}
