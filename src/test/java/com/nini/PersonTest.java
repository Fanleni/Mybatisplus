package com.nini;

import org.junit.jupiter.api.Test;

/**
 * @author nini
 * @create 2022--10--30--11:04
 */
public class PersonTest {
    @Test
    public void test1(){
        Person p1=new Person("nini",16);
        Person p2=new Person("nini",16);
        System.out.println(p1.getName()== p2.getName());
    }
}
