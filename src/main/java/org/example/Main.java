package org.example;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Бобик");
        dog.run(490);
        dog.run(600);
        dog.swim(5);
        dog.swim(20);

        Cat cat1 = new Cat("Перчик");
        cat1.run (200);
        cat1.run(350);
        cat1.swim(3);

        Cat[] cats = {
                new Cat ("Шкира"),
                new Cat ("Арни"),
                new Cat ("Шерри"),
                new Cat ("Грей")
        };

        Bowl bowl = new Bowl(25);
        System.out.println("\nКоличество еды в миске: " + bowl.getFoodAmount());

        int hunger = 10;

        for (Cat cat : cats) {
            cat.eatFromBowl(bowl, hunger);
        }
        System.out.println("После первого кормления");
        for (Cat cat : cats) {
            System.out.println(cat.name + " сыт? " + cat.getIsFull());
        }
        System.out.println("Осталось еды в миске: " + bowl.getFoodAmount());

        bowl.addFood(30);
        System.out.println("Добавили 30 еды. Теперь в миске: " + bowl.getFoodAmount());

        for (Cat cat : cats) {
            if (!cat.getIsFull()) {
                cat.eatFromBowl(bowl, hunger);
            }
        }

        System.out.println("\nПосле добавления еды и повторного кормления голодных:");
        for (Cat cat : cats) {
            System.out.println(cat.name + " сыт? " + cat.getIsFull());
        }
        System.out.println("Осталось еды в миске: " + bowl.getFoodAmount());

        boolean taken = bowl.takeFood(1000);
        System.out.println("\nПопытка взять 1000 еды: " + (taken ? "успешно" : "неудачно"));
        System.out.println("Еды в миске после попытки: " + bowl.getFoodAmount());

        System.out.println("\nВсего животных: " + Animal.getTotalAnimals());
        System.out.println("Всего кошек: " + Cat.getTotalCats());
        System.out.println("Всего собак: " + Dog.getTotalDogs());

        Circle circle = new Circle(10.5, "Blue", "Red");
        circle.printInfo();
        Rectangle rectangle = new Rectangle(5.5, 6.3, "Green", "Yellow");
        rectangle.printInfo();
        Triangle triangle = new Triangle(2.3, 2.6, 2.2, "Red", "Black");
        triangle.printInfo();
    }
}