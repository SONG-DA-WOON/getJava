package main.java;

import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {
        // 집합(배열)

        // 문자
        String[] grade = {"a", "b", "c"};
        String[] grade2 = new String[5];

        // 숫자
        int[] su = {0, 1, 2, 3, 4, 5};
        int[] su2 = new int[5];

        System.out.println(grade[1]);
        System.out.println(grade2[2]);

        System.out.println(su[2]);
        System.out.println(su2[3]);

        // 예제
        String[] people = {"john", "Smith", "jain"};
        String[] grade3 = {"A", "B", "C"};

        // loop
        for(int i=0; i < people.length; i++) {
            System.out.println(people[i]+"는 학점이"+ grade3[i] + "입니다.");
        }

        // String(문자)
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(arr));

        // 1차원 배열
        int[] score = new int[3];
        int score2[] = new int[] {90, 80, 70};
        int[] score3 = new int[] {90, 50, 70};
        int score4[] = new int[] {90, 50, 70};

        String[] subject = new String[3];
        String subject2[] = new String[] {"kor", "math", "eng"};

        System.out.println(score);
        System.out.println(Arrays.toString(score2));
        System.out.println(Arrays.toString(score3));
        System.out.println(score4);

        System.out.println(subject);
        System.out.println(subject2);

        System.out.println("subject 배열의 첫번째 요서(0번 인덱스)의 값 : " + subject2[0]);
        System.out.println("subject 배열의 두번째 요서(1번 인덱스)의 값 : " + subject2[1]);
        System.out.println("subject 배열의 세번째 요서(2번 인덱스)의 값 : " + subject2[2]);
        System.out.println("subject 배열의 네번째는 없지요");
    }

}
