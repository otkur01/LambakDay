package com.Comparator_interface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer>list = Arrays.asList(10,20,50,40,70,90,10,50);
       // Collections.sort(list);
         Collections.sort(list,Integer::compareTo);
        System.out.println(list);
        Collections.sort(list,new MyCoparator());
        System.out.println(list);
        Collections.sort(list,((o1, o2) -> (o1>o2) ? 1:(o2>o1)?-1 : 0));
        System.out.println(list);
         // accending order
        list.sort((o1, o2) -> o1.compareTo(o2));
        System.out.println(list);
        //desending
        list.sort(((o1, o2) ->  o2.compareTo(o1)));
        System.out.println(list);
        list.sort((Comparator.reverseOrder()));
        System.out.println(list);

    }

}
