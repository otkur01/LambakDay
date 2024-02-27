package com.double_colon_operators;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class carTest {
    public static void main(String[] args) {
        //zero argument constructor

        Supplier<Car>c1 = ()->new Car();
        System.out.println(c1.get().getModel());

        Supplier<Car>c2 = Car::new;
        Function<Integer,Car>c3 = Car::new;
        System.out.println(c3.apply(10).getModel());

        BiFunction<String,Integer,Car>c4 = Car::new;
        System.out.println(c4.apply("Honda",2015).toString());


    }


}
