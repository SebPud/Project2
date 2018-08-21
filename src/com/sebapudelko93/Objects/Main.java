package com.sebapudelko93.Objects;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Sebastian",24,true,65,173);
        System.out.println(human1.getAge());
        System.out.println(human1.getHeight());
        System.out.println(human1.getName());
        System.out.println(human1.getWeight());
        System.out.println(human1.isMale());
    }
}
