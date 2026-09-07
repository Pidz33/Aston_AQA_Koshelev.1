import org.example.MathMethods;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class MathMethodsForTesngTests {
    private MathMethods mathMethods = new MathMethods();

    @DataProvider(name = "Tests_for_factorial")
    public Object[][] TestsForFactorial() {
        return new Object[][]{
                {0, 1},
                {1, 1},
                {2, 2},
                {3, 6},
                {4, 24},
                {5, 120},
                {6, 720},
                {7, 5040}
        };
    }

    @Test(dataProvider = "Tests_for_factorial", description = "Тест на вычисле факториала числа")
    void calculateFactorialPositiveTest(int n, int expected) {
        int actual = mathMethods.calculateFactorial(n);
        assertEquals(actual, expected, "Факториал числа " + n + " должен быть " + expected);
    }

    @Test(description = "Тест на отрицательное число с факториалом",
            expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "Факториал не может быть отрицательным")
    void calculateFactorialNegativeTest() {
        mathMethods.calculateFactorial(-5);
    }

    @DataProvider(name = "Positive_Test_For_Triangle")
    public Object[][] PositiveTestForTriangle() {
        return new Object[][]{
                {3, 4, 5, 6.0},
                {5, 5, 5, 10.82},
                {3.3, 3.3, 3.3, 4.71}
        };
    }

    @Test(dataProvider = "Positive_Test_For_Triangle", description = "Положительный тест на вычисление площади треугольника")
    void calculateTriangleTest(double a, double b, double c, double expected) {
        double result = mathMethods.calculateTriangle(a, b, c);
        assertEquals(result, expected, 0.01, "Стороны треугольника: " + a + " " + b + " " + c + " равняется" + expected);

    }

    @DataProvider(name = "Negative_Test_For_Triangle_Where_One_Side_Bigger_Than_Others")
    public Object[][] NegativeTestForTriangleWhereOneSideBiggerThan_Others() {
        return new Object[][]{
                {9, 3, 3},
                {3, 9, 3},
                {3, 3, 9}
        };
    }

    @Test(dataProvider = "Negative_Test_For_Triangle_Where_One_Side_Bigger_Than_Others", description = "Тест на треугольник, где одна сторона больше других", expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "Одна сторона не может быть больше суммы двух других")
    void calculateTriangleWhereOneSideBiggerThanTwoOthersTest(double a, double b, double c) {
        mathMethods.calculateTriangle(a, b, c);
    }

    @DataProvider(name = "Tets_For_Triangle_Where_One_Side_Negative_Or_Zero")
    public Object[][] TestForTriangleWhereOneSideNegativeOrZero() {
        return new Object[][]{
                {0, 3, 3},
                {3, 0, 3},
                {3, 3, 0},
                {-1, 3, 3},
                {3, -1, 3},
                {3, 3, -1}
        };
    }

    @Test(dataProvider = "Tets_For_Triangle_Where_One_Side_Negative_Or_Zero", description = "Тест на треугольник, где одна строна ноль или отрицательна", expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "Сторона не может быть отрицательной или нулевой")
    void calculateTriangleWhereOneSideNegativeTest(double a, double b, double c) {
        mathMethods.calculateTriangle(a, b, c);
    }

    @DataProvider(name = "Add_Test")
    public Object[][] TestForAdd() {
        return new Object[][]{
                {2, 2, 4},
                {10, 10, 20},
                {-10, 5, -5},
                {10, 0, 10}
        };
    }

    @Test(dataProvider = "Add_Test", description = "Тест сложение")
    void mathMethodsAddTest(int a, int b, int expected) {
        int result = mathMethods.add(a, b);
        assertEquals(result, expected, "Сумма сложения двух чисел должна быть: " + expected);
    }

    @DataProvider(name = "Subtract_Test")
    public Object [] [] subtractTest () {
        return new Object[][] {
                {4, 2, 2},
                {10, 10, 0},
                {0, 0, 0},
                {10, 15, -5}
        };
    }
    @Test(dataProvider = "Subtract_Test", description = "Тест на вычитание")
    void mathMethodsSubtractTest (int a, int b, int expected) {
        int result = mathMethods.subtract(a, b);
        assertEquals(result, expected, "Сумма после вычитания должна быть: " + expected);
    }

    @DataProvider(name = "Test_For_Multiply")
    public Object[][] TestForMultiply() {
        return new Object[][]{
                {4, 2, 8},
                {10, 10, 100},
                {0, 0, 0},
                {-15, 10, -150}
        };
    }

    @Test(dataProvider = "Test_For_Multiply", description = "Тесты на умножение")
    void mathMethodsMultiplyTest(int a, int b, int expected) {
        int result = mathMethods.multiply(a, b);
        assertEquals(result, expected, "Сумма умножения должна быть: " + expected);
    }

    @DataProvider(name = "Test_For_Divide")
    public Object[][] TestForDivide() {
        return new Object[][]{
                {8, 2, 4},
                {100, 10, 10},
                {-150, 10, -15}
        };
    }

    @Test(dataProvider = "Test_For_Divide", description = "Тест на деление")
    void mathMethodsDivideTest(int a, int b, int expected) {
        int result = mathMethods.divide(a, b);
        assertEquals(result, expected, "Сумма деления должна быть: " + expected);
    }

    @Test(description = "Тест с делением на ноль",  expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "Делитель не может быть нулём")
    void mathMethodsDivideByZeroTest () {
        mathMethods.divide(10,0);
    }

    @DataProvider(name = "Compare_Test")
        public Object [] [] compareTest () {
        return new Object[][] {
                {5, 5, 0},
                {10, 5, 1},
                {5, 10, -1}
        };
    }
    @Test(dataProvider = "Compare_Test", description = "Тест на сравнивание чисел")
    void mathMethodsCompareTest (int a, int b, int expected) {
        int result = mathMethods.compare(a, b);
        assertEquals(result, expected, "Результат сравнения чисел (0 - числа совпадают, 1 - a>b, -1 - a<b):" + expected);
    }
}