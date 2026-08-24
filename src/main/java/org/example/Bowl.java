package org.example;

public class Bowl {
    private int foodAmount;

    public Bowl(int foodAmount) {
        this.foodAmount = foodAmount;

    }
    public void addFood (int amount) {
        if (amount > 0) {
            foodAmount += amount;
        }
    }
    public boolean takeFood (int amount) {
        if (foodAmount >= amount) {
            foodAmount -= amount;
            return true;
        }
        return false;
    }
    public int getFoodAmount () {
        return foodAmount;
    }
}