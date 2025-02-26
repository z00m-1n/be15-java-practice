package com.jumee.level01.basic;

public class Application2 {

    /*`Number` 타입 또는 그 하위 타입만 허용하는 `sum` 메서드를 작성한다.
     * Application2 클래스 내에 static 메소드로 작성하며 배열을 매개변수로 받아 해당 요소들의 합계를 반환하도록 한다.
     * Number 하위 타입이 아닌 경우 컴파일 에러가 발생하는 것을 확인한다.*/
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Integer 합계 : " + sum(intArray));

        Double[] doubleArray = {1.1, 2.2, 3.3};
        System.out.println("Double 합계 : " + sum(doubleArray));

        String[] strArray = {"A", "B", "C"};
//         System.out.println("String 합계 : " + sum(strArray));  // 컴파일 에러 발생
    }

    public static <T extends Number> T sum(T[] tArr){
        double res=0;
        for(int i=0; i<tArr.length; i++){
            res += tArr[i].doubleValue();
        }

        if (tArr[0] instanceof Integer) {
            return (T) Integer.valueOf((int) res);
        } else if (tArr[0] instanceof Double) {
            return (T) Double.valueOf(res);
        } else if (tArr[0] instanceof Long) {
            return (T) Long.valueOf((long) res);
        } else if (tArr[0] instanceof Float) {
            return (T) Float.valueOf((float) res);
        } else if (tArr[0] instanceof Short) {
            return (T) Short.valueOf((short) res);
        } else if (tArr[0] instanceof Byte) {
            return (T) Byte.valueOf((byte) res);
        }
        return null;
    }
}
