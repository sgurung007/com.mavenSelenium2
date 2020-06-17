package com.company;

public class EnumSuraj {
    public static void main(String[] args) {


        employee<String, String> user1 = new employee<>("dog", "cat");
        System.out.println(user1.getName1());

        employee<Integer,Integer> user2=new employee<>(30,43);
        System.out.println(user2.getName1());


    }
}
