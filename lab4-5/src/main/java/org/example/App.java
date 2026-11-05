package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Приет Кириллл Конон");

        int choice;

        do {
            System.out.println("1. Класс «Квартира» ");
            System.out.println("2. Класс «Ресторан» ");
            System.out.println("3. Enum «Car» ");
            System.out.println("0. Выход");
            System.out.print("Ваш выбор: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    Apartment apartment = new Apartment("ул. Ленина, д. 10, кв. 5", 3, 72);
                    double totalPrice = 8500000;
                    double pricePerSquareMeter = apartment.pricePerSquareMeter(totalPrice);
                    System.out.println(apartment);
                    System.out.println("Квартира:");
                    System.out.println("Адрес: " + apartment.getAddress());
                    System.out.println("Комнат: " + apartment.getRooms());
                    System.out.println("Площадь: " + apartment.getArea() + " кв.м");
                    System.out.printf("Цена за квадратный метр: %.2f руб.%n", pricePerSquareMeter);
                    break;

                case 2:
                    Restaurant[] restaurants = {
                            new Restaurant("Пушкин", "русская", 4.7),
                            new Restaurant("Токио", "японская", 4.9),
                            new Restaurant("Берлин", "немецкая", 4.3),
                            new Restaurant("Париж", "французская", 4.8),
                            new Restaurant("Рим", "итальянская", 4.5)
                    };

                    Restaurant best = restaurants[0];
                    double sum = 0;
                    for (Restaurant r : restaurants) {
                        sum += r.getRating();
                        if (r.getRating() > best.getRating()) {
                            best = r;
                        }
                    }
                    double average = sum / restaurants.length;

                    System.out.println("Ресторан с максимальным рейтингом:");
                    System.out.println(best.getName() + " (" + best.getCuisine() + ") — " + best.getRating());
                    System.out.printf("Средний рейтинг: %.2f%n", average);
                    break;

                case 3:
                    Car[] cars = {
                            new Car("Toyota", Color.RED),
                            new Car("BMW", Color.BLACK),
                            new Car("Audi", Color.WHITE),
                            new Car("Kia", Color.RED),
                            new Car("Volvo", Color.GREEN),
                            new Car("Ferrari", Color.RED)
                    };

                    System.out.println("Красные автомобили (RED):");
                    for (Car car : cars) {
                        if (car.getColor() == Color.RED) {
                            System.out.println(car.getBrand() + " — " + car.getColor());
                        }
                    }
                    break;

                case 0:
                    System.out.println("Выход из программы.");
                    break;

                default:
                    System.out.println("Неверный ввод. Попробуйте снова.");
            }

        } while (choice != 0);

        scanner.close();
    }
}

