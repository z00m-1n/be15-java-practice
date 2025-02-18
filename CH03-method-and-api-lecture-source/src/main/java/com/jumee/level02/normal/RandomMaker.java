package com.jumee.level02.normal;

public class RandomMaker {
    public static int randomNumber(int min, int max){
        //최소값부터 최대값까지 범위의 난수 반환함
        return (int)(Math.random() * (max - min)) + min;
    }
    public static String randomUpperAlphabet(int length){
        // 인자의 길이 만큼의 랜덤한 대문자 알파벳으로 이루어진 문자열을 반환함
        String res = "";
        for(int i=0; i<length; i++){
            res += (char)((int)(Math.random() * ('Z' - 'A')) + 'A');
        }
        return res;
    }
    public static String rockPaperScissors(){
        // 가위, 바위, 보 중 한 가지를 반환함
        switch((int)(Math.random() * 3)){
            case 0:
                return "가위";
            case 1:
                return "바위";
            case 2:
                return "보";
        }
        return "가위바위보";
    }
    public static String tossCoin(){
        // 동전의 앞면, 뒷면 중 한 가지를 반환함
        switch((int)(Math.random() * 2)){
            case 0:
                return "앞면";
            case 1:
                return "뒷면";
        }
        return "동전";
    }
}
