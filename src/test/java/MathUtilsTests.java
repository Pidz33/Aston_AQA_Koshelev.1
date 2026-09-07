import org.example.MathUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MathUtilsTests {
    private MathUtils mathUtils = new MathUtils();

    @DisplayName("Тест на вычисле факториала числа")
    @Tag("Factorial_tests")
    @ParameterizedTest
    @CsvSource({
            "0, 1",
            "1, 1",
            "2, 2",
            "3, 6",
            "4, 24",
            "5, 120",
            "6, 720",
            "7, 5040"
    })
    void calculateFactorialPositiveTest (int n, int expected) {
        int actual = MathUtils.calculateFactorial(n);
        assertEquals(expected, actual, "Факториал числа: " + n + " равняется:" + expected);

    }

    @DisplayName("Тест на отрицательное число с факториалом")
    @Tag("Factorial_tests")
    @Test
    void calculateFactorialNegativeTest() {
    IllegalArgumentException thrown = assertThrows(
            IllegalArgumentException.class,
            () -> mathUtils.calculateFactorial(-5)
    );
    assertEquals("Факториал не может быть отрицательным", thrown.getMessage());
    }

    @DisplayName("Положительный тест на вычисление площади треугольника")
    @Tag("Triangle_tests")
    @ParameterizedTest
    @CsvSource({
            "3, 4, 5, 6.0",
            "5, 5, 5, 10.82",
            "3.3, 3.3, 3.3, 4.71"
    })
    void calculateTriangleTest(double a, double b, double c, double expected) {
        double result = mathUtils.calculateTriangle(a, b, c);
        assertEquals(expected, result,0.01, "Стороны треугольника: " + a + " " + b + " " + c + " равняется" + expected);

    }
    @DisplayName("Тест на треугольник, где одна сторона больше других")
    @Tag("Triangle_tests")
    @ParameterizedTest
    @CsvSource ({
            "9, 3, 3",
            "3, 9, 3",
            "3, 3, 9"

    })
    void calculateTriangleWhereOneSideBiggerThanTwoOthersTest (double a, double b, double c) {
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class,
                () -> mathUtils.calculateTriangle(a, b, c)
        );
        assertEquals("Одна сторона не может быть больше суммы двух других", thrown.getMessage());

    }
    @DisplayName("Тест на треугольник, где одна строна ноль или отрицательна")
    @Tag("Triangle_tests")
    @ParameterizedTest
    @CsvSource ({
            "0, 3, 3",
            "3, 0, 3",
            "3, 3, 0",
            "-1, 3, 3",
            "3, -1, 3",
            "3, 3, -1"
    })
    void calculateTriangleWhereOneSideNegativeTest(double a, double b, double c) {
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class,
                () -> mathUtils.calculateTriangle(a, b, c)
        );
        assertEquals("Сторона не может быть отрицательной или нулевой", thrown.getMessage());
    }

    @DisplayName("Тест на сложение")
    @Tag("Math_tests")
    @ParameterizedTest
    @CsvSource ({
            "2, 2, 4",
            "10, 10, 20",
            "-10, 5, -5",
            "10, 0, 10"
    })
    void mathUtilsAddTest (int a, int b, int expected) {
        int result = mathUtils.add(a, b);
        assertEquals(expected, result, "Сумма сложения двух чисел должна быть: " + expected);
    }

    @DisplayName("Тест на вычитание")
    @Tag("Math_tests")
    @ParameterizedTest
    @CsvSource ({
            "4, 2, 2",
            "10, 10, 0",
            "0, 0, 0",
            "10, 15, -5"
    })
    void mathUtilsSubtractTest (int a, int b, int expected) {
        int result = mathUtils.subtract(a, b);
        assertEquals(expected, result, "Сумма после вычитания должна быть: " + expected);
    }

    @DisplayName("Тест на умножение")
    @Tag("Math_tests")
    @ParameterizedTest
    @CsvSource ({
            "4, 2, 8",
            "10, 10, 100",
            "0, 0, 0",
            "-15, 10, -150"
    })
    void mathUtilsMultiplyTest (int a, int b, int expected) {
        int result = mathUtils.multiply(a, b);
        assertEquals(expected, result, "Сумма умножения должна быть: " + expected);
    }

    @DisplayName("Тест на деление")
    @Tag("Math_tests")
    @ParameterizedTest
    @CsvSource ({
            "8, 2, 4",
            "100, 10, 10",
            "-150, 10, -15"
    })
    void mathUtilsDivideTest (int a, int b, int expected) {
        int result = mathUtils.divide(a, b);
        assertEquals(expected, result, "Сумма деления должна быть: " + expected);

    }
    @DisplayName("Тест с делением на ноль")
    @Tag("Math_tests")
    @Test
void mathUtilsDivideByZeroTest() {
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class,
                () -> MathUtils.divide(10,0)
        );
        assertEquals("Делитель не может быть нулём", thrown.getMessage());
    }

    @DisplayName("Тест на сравнивание чисел")
    @Tag("Compare_Tests")
    @ParameterizedTest
    @CsvSource({
            "5, 5, 0",
            "10, 5, 1",
            "5, 10, -1"
    })
    void mathUtilsCompareTest(int a, int b, int expected) {
        int result = mathUtils.compare(a, b);
        assertEquals(expected, result, "Результат сравнения чисел (0 - числа совпадают, 1 - a>b, -1 - a<b):" + expected);

    }

}
