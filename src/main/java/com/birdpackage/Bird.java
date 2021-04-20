package com.birdpackage;
public abstract class Bird {
    static int count;

    abstract int getCount();

    void incrementCount() {
        count++;
    }

    void decrementCount(){
        count--;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
