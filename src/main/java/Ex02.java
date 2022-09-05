public class Ex02 {
    public static void main(String[] args) {
        int[]integerArray = new int[4]; // 크기 4의 정수형 배열
        char[]charArray = new char[10]; // 크기 10의 문자형 배열

        int[][] twoDimensionalIntArray = new int[4][5];

        System.out.println(integerArray);
        System.out.println(charArray);
        System.out.println(twoDimensionalIntArray);
    }

}
// 참조 자료형
// class(오브젝트에 대한 설계를 담고 있다)
// Array(object[]) : 여러 같은 자료형의 데이터를 정적인 크기로 저장하는 자료구조를 제공한다.
// annotation : 특정 속성 정보를 프로그램 요소에 적용하기 위한 방법을 제공한다.
// interface : class의 일종이지만, 일반적인 class 와는 달리 메소드의 정의만을 담고 있으며, interface를 상속 받는 class에서 해당 메소드들을 구현한다.
// enum : 특수한 형태의 class로, enum 안에 있는 요소들은 해당 enum 타입의 인스턴스(구현체)이다.
// 기본형을 제외한 나머지 타임, 예) String, Integer, StringBuffer, List등 혹은 개인이 만든 클래스도 참조형 타입이 가능

