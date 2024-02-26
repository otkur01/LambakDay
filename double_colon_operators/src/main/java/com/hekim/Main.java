package com.hekim;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> pred = (p) -> p%2==0 ?true : false;
        Calculate sum = (x,y)-> System.out.println(x+y);
        Calculate sum1 = (x,y)->Calculator.findSum( x,y);
        Calculate sum2 = Calculator::findSum;
        sum2.calculate(10,20);
        Calculate abs = (x, y) -> System.out.println(x*y);
        Calculator obj = new Calculator();
        Calculate mul = obj::findMultiply;
        mul.calculate(10,5);

        BiFunction<String,Integer,String>func = (str,i)->str.substring(i);

        BiFunction<String,Integer,String>func1 = String::substring;

        Function<Integer,Double>func2 = new Myclass()::method;
        System.out.println(func2.apply(10));
        BiFunction<Myclass,Integer,Double>fun3 = Myclass::method;

        Consumer<Integer> display = p-> System.out.println(p);
        Consumer<Integer> display1 = System.out::println;

        display1.accept(10);



    }
}
