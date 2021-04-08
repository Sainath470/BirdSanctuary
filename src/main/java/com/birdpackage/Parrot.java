package com.birdpackage;
public class Parrot extends Bird implements Flyable, Eatable {
    static int count;
    public void fly() {
        System.out.println("Parrot is flying");
    }

    @Override
    void incrementCount() {
        count++;
    }

    @Override
    void decrementCount(){
        count--;
    }


    public void eat() {
        System.out.println("Parrot is eating");
    }

    @Override
    int getCount() {
        return count;
    }

}

