package org.example;

public class Soup implements Cookable, Storable {
    private String name;
    private String ingredients;
    private int cookingTime;
    private String expirationDate;

    public Soup(String name, String ingredients, int cookingTime, String expirationDate) {
        this.name = name;
        this.ingredients = ingredients;
        this.cookingTime = cookingTime;
        this.expirationDate = expirationDate;
    }

    @Override
    public void cook() {
        System.out.println("Варим суп \"" + name + "\" из ингредиентов: " + ingredients);
    }

    @Override
    public int getCookingTime() {
        return cookingTime;
    }
    @Override
    public void store() {
        System.out.println("Наливаем суп \"" + name + "\" в кастрюлю и ставим в холодильник.");
    }

    @Override
    public String getExpirationDate() {
        return expirationDate;
    }
}