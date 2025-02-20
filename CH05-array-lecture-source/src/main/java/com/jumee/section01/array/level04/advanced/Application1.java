package com.jumee.section01.array.level04.advanced;

import java.util.Random;
import java.util.Arrays;

public class Application1 {
	public static boolean isMultiple(int[] arr, int index, int val){
		for(int i=0; i<index; i++){
			// 앞에 겹치는 난수가 있다고 판단되면 다시 새로운 난수를 구하라는 의미에서 false 반환
			if (arr[i] == val) {
//				System.out.println(">>> 중복 찾음. arr["+i+"]가 이미 "+val);
				return false;
			}
		}
		return true;
	}
    public static void main(String[] args) {
        /* 로또번호 생성기
		 * 6칸 짜리 정수 배열을 하나 생성하고
		 * 1부터 45까지의 중복되지 않는 난수를 발생시켜 각 인덱스에 대입한 뒤
		 * 오름차순 정렬하여 출력하세요.
		 * Arrays.sort(배열) 메소드 활용하여 정렬 가능.
         */
		Random rand = new Random();
		int[] arr = new int[6];

		arr[0] = rand.nextInt(44)+1;
//		System.out.println("### arr[0]="+arr[0]+"확정 ###");
		for(int i=1; i<arr.length; i++){
			// isMultiple 메소드로, 중복되는 값이 없다고 판단될 때까지 랜덤 난수 돌림
			// --> 중복되는 값 찾으면 f 반환 = 다시 돌아야 함.
			boolean isMultiple = false;
			while(!isMultiple){
				int newRand = rand.nextInt(44)+1;
//				System.out.println(i+"번째의 랜덤한 숫자 : "+newRand);
				arr[i] = newRand;
				isMultiple = isMultiple(arr, i, newRand);
			}
//			System.out.println("### arr["+i+"]="+arr[i]+"확정 ###");
		}
		Arrays.sort(arr);
		for(int res : arr) System.out.print(res+ " ");
    }
}
