package main.java;

import java.util.*;

public class Ex05 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> it = list.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());

        // while을 이용하는 방법
        // List를 이용한 예제
        Iterator<Integer> it2 = list.iterator();
        while(it2.hasNext()) {
            Integer element = it2.next();
            System.out.println(element);
        }

        // map을 이용한 방법
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");

        Iterator<Integer> it3 = map.keySet().iterator();
        while(it3.hasNext()) {
            Integer key = it3.next();
            String value = map.get(key);
            System.out.println(key + " - " + value);
        }
        
        // for을 이용한 방법
        // List를 이용한 예제
        for(Iterator<Integer> it4 = list.iterator(); it4.hasNext();) {
            System.out.println(it4.next());
        }

        Map<Integer, String> map2 = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");

        for(Iterator<Integer> it5 = map.keySet().iterator();it5.hasNext();) {
            Integer key = it5.next();
            String value = map.get(key);
            System.out.println(key + " - " + value);
        }

        // for-each를 이용한 방법
        // list 를 이용한 방법
        for(Integer element:list) {
            System.out.println(element);
        }

        list.forEach(System.out::println);

        // map을 이용한 방법
        for(Integer key : map.keySet()) {
            System.out.println(key + " - " + map.get(key));
        }

        // stream - forEach 를 이용한 방법
        // list를 이용한 예제
        list.stream().forEach(System.out::println);
        
        // Mao을 이용한 예제
        map.keySet().stream().forEach(key -> System.out.println( key + " - " + map.get(key)));

        // java6 이전까지는 컬렉션의 엘리먼트들을 순회하기 위해서 iterator 객체를 이용했다.
    }
}
