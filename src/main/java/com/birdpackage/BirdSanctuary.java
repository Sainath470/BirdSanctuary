package com.birdpackage;

import java.util.HashSet;
import java.util.Set;

public class BirdSanctuary {
    private Set<Bird> birdsList = new HashSet<>();

    static BirdSanctuary instance;

    private BirdSanctuary() {
    }

    public synchronized static BirdSanctuary getInstance() {
        if (instance == null) {
            instance = new BirdSanctuary();
        }
        return instance;
    }

    public void addBird(Bird bird) {
        try {
            if (bird == null) {
                throw new BirdSanctuaryAddException("Bird does not exist");
            }
                if(birdsList.add(bird)) {
                bird.incrementCount();
            }
        } catch(BirdSanctuaryAddException e) {
            e.printStackTrace();
        }
    }

    public void removeBird(Bird bird){
        birdsList.remove(bird);
            bird.decrementCount();
    }

    public void printSwimmable() {
//        for (Bird bird : birdsList) {
//            if (bird instanceof Swimmable) {
//                ((Swimmable) bird).swim();
//            }
//        }
        birdsList.stream().filter(bird -> bird instanceof Swimmable)
                .forEach(bird -> ((Swimmable)bird).swim());
    }


    public void printFlyable() {
//        for (Bird bird : birdsList) {
//            if (bird instanceof Flyable) {
//                ((Flyable) bird).fly();
//            }
//        }
        birdsList.stream().filter(bird -> bird instanceof Flyable)
                .forEach(bird -> ((Flyable)bird).fly());
    }

    public void printEatable() {
//        for (Bird bird : birdsList) {
//            if (bird instanceof Eatable) {
//                ((Eatable) bird).eat();
//            }
//        }
        birdsList.stream().filter(bird -> bird instanceof Eatable)
        .forEach(bird -> ((Eatable)bird).eat());

    }

}





