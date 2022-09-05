package main.java;

import main.java.Dto.MemberDto;

import java.awt.*;
import java.lang.reflect.Field;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class Ex07 {
    public static void main(String[] args) {
        MemberDto m1 = new MemberDto();
        MemberDto m2 = new MemberDto();
        MemberDto m3 = new MemberDto();
        MemberDto m4 = new MemberDto();
        MemberDto m5 = new MemberDto();
        
        m1.setName("홍길동");
        m1.setAddress("성남시");
        m1.setNumber("17");
        
        m2.setName("손흥민");
        m2.setAddress("분당");
        m2.setNumber("7");
        
        m3.setName("박지성");
        m3.setAddress("수원");
        m3.setNumber("13");
        
        m4.setName("차범근");
        m4.setNumber("10");
        m4.setAddress("서울");
        
        m5.setNumber("15");
        m5.setName("알랄라");
        m5.setAddress("태국");

        ArrayList<MemberDto> member = new ArrayList<MemberDto>();
        member.add(m1);
        member.add(m2);
        member.add(m3);
        member.add(m4);
        member.add(m5);

        Iterator<MemberDto> it = member.iterator();
        while(it.hasNext()) {
            MemberDto memberDto = it.next();

            System.out.println(memberDto.getName() + memberDto.getAddress() + memberDto.getNumber());
//            System.out.println(element.getAddress());
//            System.out.println(element.getNumber());
        }

    }
}
