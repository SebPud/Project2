package com.sebapudelko93.Objects;

public class Human {
    private String name;
    private int age;
    private boolean isMale;
    private int weight;
    private int height;

    public Human(String name, int age, boolean isMale, int weight, int height) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMale() {
        return isMale;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }
}
