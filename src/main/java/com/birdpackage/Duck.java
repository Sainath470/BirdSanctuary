package com.birdpackage;

public class Duck extends Bird implements Flyable,Swimmable, Eatable{
    static int count;
    public void fly()
    {
        System.out.println("Duck is flying");
    }

    @Override
    void incrementCount() {
        count++;
    }

    @Override
    void decrementCount() {
      count--;
    }

    @Override
    public void eat() {
        System.out.println("Duck is eating");
    }

    @Override
    int getCount() {
        return count;
    }

    public void swim()
    {
        System.out.println("Duck is swimming");
    }

}
