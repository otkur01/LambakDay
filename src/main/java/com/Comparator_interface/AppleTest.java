package com.Comparator_interface;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class AppleTest {
    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(300,Color.GREEN));
        inventory.add(new Apple(200,Color.RED));
        inventory.add(new Apple(450,Color.GREEN));
        inventory.add(new Apple(100,Color.RED));
        inventory.add(new Apple(200,Color.RED));
        inventory.add(new Apple(100,Color.GREEN));

        Comparator<Apple>sorApple = comparing((Apple apple) ->apple.getWeight());
      inventory.sort(sorApple);

        System.out.println(inventory);

        Comparator<Apple>sorApple1 = comparing(Apple::getWeight);
        inventory.sort(sorApple1);

        System.out.println(inventory);
        inventory.sort(comparing(Apple::getWeight).reversed());
        System.out.println(inventory);

        inventory
                .sort(comparing(Apple::getWeight)
                        .reversed().thenComparing(Apple::getWeight ));

        System.out.println(inventory);

    }
}
