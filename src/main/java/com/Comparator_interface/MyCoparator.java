package com.Comparator_interface;

import java.util.Comparator;

public class MyCoparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return (o1>o2) ? -1:(o2>o1)?1 : 0;
    }
}
