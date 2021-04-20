package com.birdpackage;
public class Penguin extends Bird implements Swimmable , Eatable{
   static int count;

    @Override
    void incrementCount() {
        count++;
    }

    @Override
     void decrementCount(){
        count--;
    }

    @Override
     public void eat() {
        System.out.println("Penguin is eating");
    }

    @Override
    int getCount() {
        return count;
    }

    @Override
    public void swim() {
        System.out.println("Penguin is swimming");
    }
}
