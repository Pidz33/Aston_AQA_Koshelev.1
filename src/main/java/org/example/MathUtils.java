package org.example;

public class MathUtils {

    public static int calculateFactorial (int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал не может быть отрицательным");
        }
            int result = 1;
            for (int i = 2; i <= n; i++) {
                result *=i;
            }
                return result;

    }

    public static double calculateTriangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Сторона не может быть отрицательной или нулевой");
        }
        if (a >= b + c || b >= a+c || c >= a + b) {
            throw new IllegalArgumentException("Одна сторона не может быть больше суммы двух других");
        }
        double p = (a + b + c)/2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }
    public static int add (int a, int b) {
        return a + b;
        }
    public  static int subtract (int a, int b) {
        return a - b;
        }
    public static int multiply (int a, int b) {
        return a * b;
        }
    public static int divide (int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Делитель не может быть нулём");
        } return a/b;
        }

        public static int compare (int a, int b) {
              if (a == b) {
                  return 0;
              }
              else if (a > b) {
                  return 1;
              } else  {
                  return -1;
              }
        }

    }