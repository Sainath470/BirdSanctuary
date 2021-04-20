package com.birdpackage;
public class Main {
    public static void main(String[] args) {
        BirdSanctuary sanctuary =BirdSanctuary.getInstance();

        Penguin penguinObj = new Penguin();
        Duck duckObj = new Duck();
        Duck duckObj2=new Duck();
        Parrot parrotObj = new Parrot();
        Parrot parrotObj2=new Parrot();
        ToyDuck toyDuckObj=new ToyDuck();

        sanctuary.addBird(duckObj);
        sanctuary.addBird(duckObj2);
        sanctuary.addBird(penguinObj);
        sanctuary.addBird(parrotObj);
        sanctuary.addBird(parrotObj2);
        sanctuary.addBird(toyDuckObj);

        sanctuary.removeBird(duckObj);
        sanctuary.removeBird(penguinObj);
        sanctuary.removeBird(parrotObj);

        sanctuary.printEatable();
        sanctuary.printFlyable();
        sanctuary.printSwimmable();

        System.out.println(duckObj.getCount());
        System.out.println(penguinObj.getCount());
        System.out.println(parrotObj.getCount());
        System.out.println(toyDuckObj.getCount());
    }
}
