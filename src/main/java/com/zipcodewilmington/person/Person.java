package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private double weight;
    private double height;
    private String eyeColor;
    private String hairColor;
    private String lastName;

    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
    }

    public Person(int age) {this.age = age;}

    public Person(String name) {this.name = name;}

    public Person(String name, int age) {this.name=name; this.age=age;}

    public void setName(String name) {this.name=name;}

    public void setAge(int age) {this.age=age;
    }

    public String getName() {
        return this.name;
    }


    public Integer getAge() {
        return this.age;
    }
    public void setHeight(Double height) {this.height=height;}
    public Double getHeight() {
        return this.height;
    }

    public void setWeight(Double weight) {this.weight=weight;}
    public Double getWeight() {
        return this.weight;
    }

    public void setEyeColor(String eyeColor) {this.eyeColor=eyeColor;}
    public String getEyeColor() {
        return this.eyeColor;
    }
    public void setHairColor(String hairColor) {this.hairColor=hairColor;}
    public String getHairColor() {
        return this.hairColor;
    }

    public void setLastName(String lastName) {this.lastName=lastName;}
    public String getLastName() {
        return this.lastName;
    }
}
