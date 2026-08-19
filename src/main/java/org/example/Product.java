package org.example;

public class Product {
    private String name;
    private String dateOfProduce;
    private String manufacturer;
    private String countryOfOrigin;
    private int price;
    private boolean buyersBookingStatus;

    Product(String productName, String productDateOfProduce, String productManufacturer, String productCountryOfOrigin, int productPrice, boolean productBuyersBookingStatus){
        name = productName;
        dateOfProduce = productDateOfProduce;
        manufacturer = productManufacturer;
        countryOfOrigin = productCountryOfOrigin;
        price = productPrice;
        buyersBookingStatus = productBuyersBookingStatus;
    }

    public void printStatus() {
        System.out.println("Название: " + name + "; " + "Дата производства: " + dateOfProduce + "; " + "Производитель: " + manufacturer + "; " + "Страна происхождения: "
                + countryOfOrigin + "; " + "Цена: " + price + "; " + "Состояние бронирование покупателем: " + buyersBookingStatus + ".");
    }
}

