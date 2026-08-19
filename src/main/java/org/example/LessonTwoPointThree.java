package org.example;

public class LessonTwoPointThree {
    public static void main(String[] args) {

        Product one = new Product("Жигулевскоё","10.07.2026", "АО Жигулёвское пиво","Российская Федерация", 120, true);

        one.printStatus();

        Park.Attraction attraction = new Park().new Attraction("Колесо обозрения", "С 9:00 до 21:00", 500);

        attraction.printAttractionInfo();

        Product[]productsArray = new Product[5];

        productsArray[0] = new Product("Iphone 16", "01.01.2026", "Apple inc", "China", 100000, true);
        productsArray[1] = new Product("Playstation 5 Pro", "30.11.2025", "Sony Group Corporation", "China", 150000, false);
        productsArray[2] = new Product("RAM ddr5 32gb", "20.02.2026", "XPG ADATA", "Taiwan", 55499, false);
        productsArray[3] = new Product("POCO X7 Pro 256gb", "30.06.2026", "Xiaomi", "China", 27699, true);
        productsArray[4] = new Product("Monitor Acer Nitro EI322QURPbmiippx", "30.05.2024", "Acer inc", "Taiwan", 26999, true);
    }
}

