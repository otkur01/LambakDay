package com.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Worker worker1 = new Worker("alim",Gender.MALE,25);
        Worker worker2 = new Worker("salim",Gender.MALE,22);
        Worker worker3 = new Worker("fatma",Gender.FEMALE,35);
        Worker worker4 = new Worker("kalbinur",Gender.FEMALE,20);
        List<Worker>workers = Arrays.asList(worker1,worker4,worker2,worker3);
        CheckWorker ck = p->p.getGender()==Gender.MALE && p.getAge()<=25;

        System.out.println(print(workers,ck));

    }

    public static List<Worker> print(List<Worker>workers, CheckWorker ck){
       List<Worker>workers1 = new ArrayList<>();
        for (Worker worker : workers) {
            if(ck.test(worker)){
              workers1.add(worker);
            }
        }
        return workers1;
    }
}
