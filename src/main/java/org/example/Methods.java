package org.example;

public class Methods {

    public static int doubleArray (String [] [] arr) throws MyArraySizeException, MyArrayDataException {
        if(arr == null) {
            throw new MyArraySizeException("Массив не должен быть null");
        }
        if (arr.length !=4) {
            throw new MyArraySizeException("Неверное количество строк: " + arr.length + ", ожидается 4х4");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null || arr[i].length !=4) {
                throw new MyArraySizeException("Строка " + i + " имеет неверную длину " + (arr[i] == null? "null" : arr[i].length));
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    int num = Integer.parseInt(arr[i][j]);
                                        sum += num;

                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Ошибка. " + "Индекс строки: " + i + ", индекс столбца: " + j + ". На чём поймано исключение " + arr[i][j]);
                }
            }
        }

return sum;
    }
    }