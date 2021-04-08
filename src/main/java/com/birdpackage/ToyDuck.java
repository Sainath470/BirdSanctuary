package com.birdpackage;
public class ToyDuck extends Bird implements Flyable,Swimmable{

    @Override
    void incrementCount() {
        count++;
    }

    @Override
    int getCount() {
        return count;
    }

    @Override
    public void fly() {
        System.out.println("ToyDuck is Flying");
    }

    @Override
    public void swim() {
        System.out.println("ToyDuck is swimming");
    }
}
