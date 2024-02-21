package com.cydeo;

public class printAppleColor implements prettyPrintApple{
    @Override
    public String printApple(Apple apple) {
       if(apple.getWeight()>=150)
        return "A Heavy " + apple.getColor()+ " apple";
       else return "A Light " + apple.getColor()+ " apple";
    }
}
