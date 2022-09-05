package main.java;

public class Ex01 {
    public static void main(String[] args){
        // 기초 자료형
//    byte(8비트 정수), short(16비트 정수), int(32비트 정수), long(64비트 정수), float(실수 32비트), double(64비트 실수), char(16비트 문자), boolean(true 또는 fals)

        // 1) char 문자를 표현하기 위한 자료형 크기 : 2byte
        // 문자는 작은 따옴표를 활용한다.
        char ch = 'A'; //  한개의 문자만 대입 할 수 있다.
        //char ch2 = 'AB'; // 문자열로 취급하여 error
        System.out.println(ch);

        // 2) byte, short, int, long
        // 연산(+, -, *, /) 시에 모든 정수 자료형을 int로 자동으로 변환하기 때문에 정수를 표현 할 때는 항상 int로 변수를 선언하는 것이 좋다.
        // byte는 자료를 모을 때나 최소 자료형으로 자료들을 분할 할 때 사용한다.

        int num = 100;
        System.out.println(num);
        //int num1 = 100.123; // 실수 자료를 정수형 변수에 대입할 수 없다.
        long l= 100L; // long형은 정수 뒤에 L을 붙여준다.
        System.out.println(l);

        // 3) float, double
        // 소수점 자료형 (실수형)

        float f = 10.123f; // float형은 실수 뒤에 f를 붙여준다.
        double d = 10.123; // double형은 소수만 표현하면 된다.

        System.out.println(f);
        System.out.println(d);

        //4) 논리값 (true/ false)를 표현하는 boolean

        boolean b1 = true;
        boolean b2 = false;

        System.out.println(b1);
        System.out.println(b2);
        // boolean b3 = 10; // true / false 이외 다른 값을 대입 할 수 없다.

        // 자료의 형변환
        char ch2 = 'A'+1; // 2byte
        int i2 = ch2; // 4byte 작은 공간에 있던 데이터는 큰 공간의 데이터 변수를 옮겨 질 수 있다.
                     // 자동형변환(묵시적, 암시적 형변환)
        System.out.println(ch2);
        System.out.println(i2);

        double d2 = 10.1; // 8byte
        int i3 = (int)d2; // 4byte
                         // 명시적(강제적) 형변환
        System.out.println(d2);
        System.out.println(i3); // 소수점 데이터 소실이 일어난ㄷ.

        byte bb = (byte)128; // -128~0~127 이므로 명시적 형변환을 사용한다.
        byte bbb = (byte)130;

        System.out.println(bb);
        System.out.println(bbb);

        String str = "Hello"; // 문자열은 큰 따옴표를 활용한다.
        System.out.println(str); // 기본 자료형이 아닌 String 클래스 이므로 참조 자료형이다.
    }
}
