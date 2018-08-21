package com.sebapudelko93.Objects;

public class Main {
    public static void main(String[] args) {
        //Human
        Human human1 = new Human("Sebastian",24,true,65,173);
        System.out.println(human1.getAge());
        System.out.println(human1.getHeight());
        System.out.println(human1.getName());
        System.out.println(human1.getWeight());
        System.out.println(human1.isMale());

        //Rectangle
        Rectangle rectangle1 = new Rectangle(32,54);
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getDiagonal());
        System.out.println(rectangle1.getPerimeter());
        System.out.println(rectangle1);
    }
}
