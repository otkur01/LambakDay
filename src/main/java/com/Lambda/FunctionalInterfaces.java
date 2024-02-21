package com.Lambda;

import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {
       //Predicate
        Predicate<Integer> lesserThan = i -> i<18;
        System.out.println(lesserThan.test(20));

        System.out.println("++++++++++++++++++++ Consumer");
        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(10);
        BiConsumer<String, Integer> show = (x,y)-> System.out.println(x+y);
        show.accept("age ",10);
        System.out.println("++++++++++++++++++++Function");
        Function<String, String>fun =  x -> x+ "Hello" ;
        System.out.println(fun.apply("Hi: "));
        BiFunction<Integer,Integer,Integer> bifun = (x,y)->x+y;
        System.out.println(bifun.apply(100, 100));

        Supplier<String> random = ()-> "allo";
        System.out.println(random.get());



    }
}
