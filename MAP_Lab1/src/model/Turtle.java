package model;

public class Turtle implements AquariumCreature{
    private int age;
    private String name;

    public Turtle(int age, String name){
        this.age = age;
        this.name = name;
    }

    public String toString(){
        return name + ", age: " + age + " years";
    }
    public int getAge(){
        return age;
    }
}
