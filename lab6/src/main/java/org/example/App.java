package org.example;

public class App {
    public static void main(String[] args) {
        Store store = new Store("Пятёрочка", "ул. Ленина, д. 10", 120);

        System.out.println("Название: " + store.getName());
        System.out.println("Адрес: " + store.getAddress());
        System.out.println("Сотрудников: " + store.getEmployeeCount());

        if (store.isLarge()) {
            System.out.println("Магазин большой (сотрудников > 50).");
        } else {
            System.out.println("Магазин небольшой (сотрудников <= 50).");
        }

        store.setEmployeeCount(30);
        System.out.println("\nПосле изменения:");
        System.out.println("Сотрудников: " + store.getEmployeeCount());

        if (store.isLarge()) {
            System.out.println("Магазин большой (сотрудников > 50).");
        } else {
            System.out.println("Магазин небольшой (сотрудников <= 50).");
        }
    }
}

