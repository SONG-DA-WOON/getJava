package main.java;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex06 {
    public static void main(String[] args) {
       int[] arr = {1, 1, 10, 30, 2};
       List<Integer> list = new ArrayList<>();
       Set<Integer> set = new HashSet<>();
       
       // Stream을 쓰지 않았을 경우
        for(int i = 0; i < arr.length; i++) { // 배열의 내용을 set에
            set.add(arr[i]);
        }
        
        Iterator<Integer> iter = set.iterator(); // set을 iterator 안에 담기
        
        for(int i = 0; iter.hasNext(); i++) { // iterator를 list안에
            list.add(iter.next());
        }
        list.sort(Comparator.reverseOrder()); // 역정렬

        System.out.println("일반 방법을 이용한 출력 : " + list.toString());
        
        // Stream을 사용하는 경우
        System.out.println("Stream을 이용한 출력 : " + Arrays.stream(arr).boxed() // Stream 생성
                .distinct() // 중복제거
                .sorted(Comparator.reverseOrder()) // 역정렬
                .collect(Collectors.toList()) // list로 반환
        );
    }

     // 스트림은 배열이나 컬렉션(List, Set, Map)으로 원하는 값을 얻을 때 for문 도배를 방지하기 위해 나온 개념이다.
    // (10줄 짜리 코드를 한줄로 적을 수있게 된다.)
    // 선언 방법 : 배열, 컬렉션(list, set, map)등을 스트림 형태로 만들기
    // 예) Stream<데이터타입> stream명 = Arrays.stream(배열명);
    //    Stream<데이터 타입> stream명 = 리스트명.stream();
    //    Stream<데이터 타입> stream명 = Stream.of('값','값'...);
}
