package org.example;

public interface Shape {
    double getPerimeter();
    double getArea();
    String getFillColor();
    String getBorderColor();

    default void printInfo () {
        System.out.println("\nПериметр: " + getPerimeter() + "," + " площадь: " + getArea() + "," + " цвет фона: " + getFillColor() + "," + " цвет границ: " + getBorderColor());
    }
}
