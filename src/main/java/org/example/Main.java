package org.example;

import static org.example.Methods.doubleArray;

public class Main {
    public static void main(String[] args) {

String [] [] arr1 = {//размер 4х4
        {"1", "2", "3", "4"},
        {"5", "6", "7", "8"},
        {"9", "10", "11", "12"},
        {"13", "14", "15", "16"}
};

        String[][] arr2 = {//размер 3х4
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"}
        };

        String[][] arr3 = {//размер 4х5
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8", "9"},
                {"10", "11", "12", "13"},
                {"14", "15", "16", "17"}
        };

        String[][] arr4 = null; //массив с null

        String[][] arr5 = {//массив с буквами
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "abc"}
        };

        String[][] arr6 = {//массив с числом и текстом
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12abc"},
                {"13", "14", "15", "16"}
        };

        try {
            int result = doubleArray(arr1);
            System.out.println("Сумма: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            int result = doubleArray(arr2);
            System.out.println("Сумма: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            int result = doubleArray(arr3);
            System.out.println("Сумма: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            int result = doubleArray(arr4);
            System.out.println("Сумма: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            int result = doubleArray(arr5);
            System.out.println("Сумма: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            int result = doubleArray(arr6);
            System.out.println("Сумма: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        int [] arrayOfNumbers = {1, 2, 3, 5};
        try {
            int value = arrayOfNumbers[10];
            System.out.println("Индекс массива: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Обращение к несуществующему индексу массива" + e.getMessage());
        }

    }
}