package com.birdpackage;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BirdSanctuary {
    private Set<Bird> birdsList = new HashSet<>();

    static BirdSanctuary instance;

    private BirdSanctuary(){}

    public synchronized static BirdSanctuary getInstance() {
        if(instance == null) {
            instance = new BirdSanctuary();
        }
        return instance;
    }
    public void add(Bird bird) {
        birdsList.add(bird);
        bird.incrementCount();
    }

    public void removeBird(Bird bird){
        birdsList.remove(bird);
            bird.decrementCount();
    }

    public void printSwimmable() {
        for (Bird bird : birdsList) {
            if (bird instanceof Swimmable) {
                ((Swimmable) bird).swim();
            }
        }
    }

    public void printFlyable() {
        for (Bird bird : birdsList) {
            if (bird instanceof Flyable) {
                ((Flyable) bird).fly();
            }
        }
    }

    public void printEatable() {
        for (Bird bird : birdsList) {
            if (bird instanceof Eatable) {
                ((Eatable) bird).eat();
            }
        }
    }

}





