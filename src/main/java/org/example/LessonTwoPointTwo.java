package org.example;
import java.util.Arrays;

public class LessonTwoPointTwo {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(isSumCheck(5,10));
        checkNumbers(1);
        System.out.println(isNumberCheck(-1));
        printSomeText("dd", 4);
        System.out.println(isTypeOfYear(2400));
        System.out.println(Arrays.toString(changeArray()));
        System.out.println(Arrays.toString (increasingArr()));
        System.out.println(Arrays.toString(multiplicationArr()));
        System.out.println(Arrays.deepToString(squareArray()));
        System.out.println(Arrays.toString(oneDimensionalArr(5,4)));

    }

    public static void printThreeWords() {//Первое задание
        System.out.println("Orange, Banana, Apple");

    }
    public static void checkSumSign() {//Второе задание
        int a = 1;
        int b = 2;
        if (a + b > 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {//Третье задание
        int value = 101;
        if (value < 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");

        }
    }
    public static void compareNumbers() {//Четвертое задание
        int a = 20;
        int b = 20;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    public static boolean isSumCheck(int a, int b) {//Пятое задание
        boolean result;
        int sum = a + b;
        result = sum >= 10 && sum <= 20;
        return result;
    }
    public static void checkNumbers(int number){//Шестое задание
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    public static boolean isNumberCheck (int c) {//Седьмое задание
        if (c < 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void printSomeText (String text, int times) {//Восьмое задание
        for (int i = 0; i < times; i = i + 1) {
            System.out.println(text);
        }

    }
    public static boolean isTypeOfYear (int year) {//Девятое задание
        if(year % 4 !=0){
            return false;
        } if (year % 100 == 00 && year % 400 !=0) {
            return false;
        } else return true;
    }
    public static int[] changeArray() {//Десятое задание
        int[] arrNums = {1, 1, 1, 1, 0, 0, 0, 0};
        for (int i = 0; i < arrNums.length; i++) {
            arrNums[i] = 1 - arrNums[i];

        }
        return arrNums;
    }
    public static int[] increasingArr () {//Одиннадцатое задание
        int [] nums = new int[100];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;

        }
        return nums;
    }
    public static int [] multiplicationArr () {//Двенадцатое задание
        int [] arrays = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] < 6) {
                arrays[i] = arrays[i] * 2;
            }
        } return arrays;

    }
    public static int [] [] squareArray () {//Тринадцатое задание
        int [] [] dimensional = new int [5] [5];
        for (int i = 0; i < dimensional.length; i++) {
            dimensional [i] [i] = 1;
        } return dimensional;
    }

    public static int [] oneDimensionalArr(int len, int initialValue) {//Четырнадцатое задание
        int [] oneArray = new int[len];
        for (int i = 0; i < oneArray.length; i++) {
            oneArray[i] = initialValue;
        } return oneArray;

    }



}