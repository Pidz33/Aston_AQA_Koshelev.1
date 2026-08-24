package org.example;

public class Cat extends Animal {
    private static int totalCats = 0;
    private boolean isFull = false;

    public Cat (String name) {
        super(name);
        this.maxDistanceRun = 200;
        this.maxDistanceSwim = 0;
        this.isFull = false;
        totalCats++;
    }
    public static int getTotalCats () {
        return totalCats;
    }
    public void eatFromBowl (Bowl bowl, int hunger) {
        if (bowl.takeFood(hunger)) {
            isFull = true;
        }
    }
    public boolean getIsFull () {
        return isFull;
    }
}