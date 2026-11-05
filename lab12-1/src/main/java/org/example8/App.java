package org.example8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "Toyota", "Camry", 5, Arrays.asList(5, 4, 5)));
        cars.add(new Car(2, "BMW", "X5", 4, Arrays.asList(2, 1, 3)));
        cars.add(new Car(3, "Audi", "A6", 4, Arrays.asList(4, 4, 5)));
        cars.add(new Car(4, "BMW", "M3", 3, Arrays.asList(3, 2, 3)));
        cars.add(new Car(5, "Audi", "Q7", 5, Arrays.asList(5, 5, 4)));
        cars.add(new Car(6, "Mercedes", "E200", 4, Arrays.asList(4, 3, 4)));
        cars.add(new Car(7, "Toyota", "Corolla", 3, Arrays.asList(4, 4, 4)));

        System.out.println("Исходный список автомобилей:");
        for (Car car : cars) {
            System.out.println(car);
        }

        Iterator<Car> iterator = cars.iterator();
        while (iterator.hasNext()) {
            Car car = iterator.next();
            if (car.getAverageReview() < 3) {
                iterator.remove();
            }
        }
        System.out.println();
        System.out.println("После удаления автомобилей со средним рейтингом меньше 3:");
        for (Car car : cars) {
            System.out.println(car);
        }
        for (Car car : cars) {
            if (car.getAverageReview() >= 4) {
                car.setRating(car.getRating() + 1);
            }
        }
        System.out.println();
        System.out.println("После повышения рейтинга автомобилей со средним рейтингом не меньше 4:");
        for (Car car : cars) {
            System.out.println(car);
        }

        System.out.println();
        System.out.println("Автомобили с рейтингом не меньше 5:");
        printCars(cars, 5);


        cars.sort(new Comparator<Car>() {
            @Override
            public int compare(Car first, Car second) {
                int result = second.getBrand().compareTo(first.getBrand());
                if (result != 0) {
                    return result;
                }
                return first.getBrand().compareTo(second.getBrand());
            }
        });
        System.out.println();
        System.out.println("Автомобили, упорядоченные по убыванию среднего рейтинга:");
        for (Car car : cars) {
            System.out.println("id = " + car.getId()
                    + ", бренд = " + car.getBrand()
                    + ", средний рейтинг = " + car.getAverageReview());
        }
    }

    public static void printCars(List<Car> cars, int rating) {
        for (Car car : cars) {
            if (car.getRating() >= rating) {
                System.out.println(car);
            }
        }
    }
}