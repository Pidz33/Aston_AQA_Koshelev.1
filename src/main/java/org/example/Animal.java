package org.example;

public abstract class Animal {
    protected String name;
    protected int maxDistanceRun;
    protected int maxDistanceSwim;
    protected  static int totalAnimals = 0;

    public Animal (String name) {
        this.name = name;
        totalAnimals++;
    }

    public void run (int distance) {
        if (distance <= maxDistanceRun) {
            System.out.println(name + " пробежал" + " " + distance + " м.");
        } else {
            System.out.println("Не смог пробежать");
        }
    }

    public void swim (int distance) {
        if (distance <= maxDistanceSwim) {
            System.out.println(name + " проплыл" + " " + distance + " м.");
        } else {
            System.out.println("Не смог проплыть");
        }
    }
    public static int getTotalAnimals() {
        return totalAnimals;
    }
}
