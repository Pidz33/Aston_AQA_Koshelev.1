package org.example;

public class Dog  extends Animal {
private static int totalDogs = 0;

public Dog (String name) {
    super(name);
    this.maxDistanceRun = 500;
    this.maxDistanceSwim = 10;
    totalDogs++;
}
public static int getTotalDogs () {
    return totalDogs;
}
}