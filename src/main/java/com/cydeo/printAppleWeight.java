package com.cydeo;

public class printAppleWeight implements prettyPrintApple{
    @Override
    public String printApple(Apple apple) {
        return "An apple of " + apple.getWeight() + "g";
    }
}
