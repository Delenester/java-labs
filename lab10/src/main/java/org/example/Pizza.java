package org.example;


public class Pizza implements Cookable, Storable {
    private String name;
    private String toppings;
    private int cookingTime;
    private String expirationDate;

    public Pizza(String name, String toppings, int cookingTime, String expirationDate) {
        this.name = name;
        this.toppings = toppings;
        this.cookingTime = cookingTime;
        this.expirationDate = expirationDate;
    }


    @Override
    public void cook() {
        System.out.println("Выпекаем пиццу \"" + name + "\" с начинкой: " + toppings);
    }

    @Override
    public int getCookingTime() {
        return cookingTime;
    }


    @Override
    public void store() {
        System.out.println("Упаковываем пиццу \"" + name + "\" в коробку и убираем в холодильник.");
    }

    @Override
    public String getExpirationDate() {
        return expirationDate;
    }
}