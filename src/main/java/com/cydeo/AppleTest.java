package com.cydeo;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {
    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(300,Color.GREEN));
        inventory.add(new Apple(200,Color.RED));
        inventory.add(new Apple(450,Color.GREEN));
        inventory.add(new Apple(100,Color.RED));
        inventory.add(new Apple(200,Color.RED));
        inventory.add(new Apple(100,Color.GREEN));

        List<Apple>heavyApple = filterApples(inventory,new AppleHeavyPredicate());
        System.out.println(heavyApple);


        List<Apple>greenApple = filterApples(inventory,new AppleGreenColorPredicate());
        System.out.println(greenApple);

        ApplePredicate weightPredicate = (Apple apple) ->apple.getWeight()>200;

        System.out.println( filterApples(inventory,weightPredicate));
          PrintApple(inventory,new printAppleColor());
          PrintApple(inventory,new printAppleWeight());


    }

    private static List<Apple> filterApples(List<Apple> inventory,ApplePredicate ap){
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if(ap.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }

    public static void PrintApple(List<Apple> inventory, prettyPrintApple pt){
        for(Apple apple : inventory){
            String output = pt.printApple(apple);
            System.out.println(output);
        }
    }
}
