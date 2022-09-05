package main.java;

import java.util.Arrays;

public class Ex02 {
// 참조 자료형
// class(오브젝트에 대한 설계를 담고 있다)
// Array(object[]) : 여러 같은 자료형의 데이터를 정적인 크기로 저장하는 자료구조를 제공한다.
// annotation : 특정 속성 정보를 프로그램 요소에 적용하기 위한 방법을 제공한다.
// interface : class의 일종이지만, 일반적인 class 와는 달리 메소드의 정의만을 담고 있으며, interface를 상속 받는 class에서 해당 메소드들을 구현한다.
// 기본형을 제외한 나머지 타임, 예) String, Integer, StringBuffer, List등 혹은 개인이 만든 클래스도 참조형 타입이 가능
// enum : 특수한 형태의 class로, enum 안에 있는 요소들은 해당 enum 타입의 인스턴스(구현체)이다.


    public static void main(String[] args){
        // 기본형 자료형
        int value1 = 3;
        int value2 = value1;
        value2 = 7;

        System.out.println(value1);
        System.out.println(value2);

    // 참조 자료형
            int[] array1 = {1, 2, 3};
            int[] array2 = array1;

            array2[0] = 9;

            System.out.println(Arrays.toString(array1)); // [9, 2, 3]
            System.out.println(Arrays.toString(array2)); // [9, 2, 3]

        // value2 = valu1 을 넣으면 실제 값 자체가 복사 된다. 하지만 arra2 = array1 을 하게 되면 가르키고 있는 주소가 복사된다.
        // 즉 같은 객체를 가리키게 되는 것이다. 이때 array1 이든 2든 값을 바꾸면 당연히 가리키고 있는 값이 바뀌고 출력문의 결과도 달라지게 되는 것이다.
    }
}

