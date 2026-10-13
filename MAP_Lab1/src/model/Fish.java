package model;

public class Fish implements AquariumCreature{
    private int age;
    private String name;

    public Fish(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString(){
        return name + ", age: " + age + "years";
    }

    public int getAge(){
        return age;
    }
}
