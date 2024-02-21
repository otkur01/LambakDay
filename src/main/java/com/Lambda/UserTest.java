package com.Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UserTest {
    public static void main(String[] args) {


        List<User> users = new ArrayList<>();

        users.add(new User("alim","salim",25));
        users.add(new User("kalim","yasin",35));
        users.add(new User("malim","kerim",20));
         print(users,user -> true);
         print(users,user -> user.getFirstName().startsWith("a"));

     }

     public static void print(List<User>users, Predicate<User> p){
         for (User user : users) {
             if(p.test(user)) System.out.println(user.toString());
         }
     }
}
