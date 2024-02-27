package com.Stram;

import java.util.Arrays;
import java.util.List;

public class StramOpetations {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,5,3,45,89);
        list.forEach(System.out::println);



        //filter
        list.stream()
                .filter(p->p%2==0)
                .forEach(System.out::println);
        System.out.println("+++++++++++++++++++++++++++++++distinct");
        list.stream()
                .filter(i->i%2==1)
                .distinct().forEach(System.out::println);//stram closed by foreach
         //Limit
        System.out.println("limt+++++++++++++++++++++++++++++++++++++");
        list.stream()
                .filter(i -> i%2==1)
                .limit(1)
                .forEach(System.out::println);
        System.out.println("skip+++++++++++++++++++++++++++++++++++++");
        list.stream()
                .filter(i -> i%2==1)
                .skip(1)
                .forEach(System.out::println);
    }
}
