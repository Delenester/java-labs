package org.example;

public class App {
    public static void main(String[] args) {

        Cookable.printKitchenRules();
        Pizza pizza1 = new Pizza("Маргарита", "Томаты, моцарелла, базилик", 15, "2 дня");
        Pizza pizza2 = new Pizza("Пепперони", "Пепперони, сыр, томатный соус", 18, "3 дня");
        Pizza pizza3 = new Pizza("Четыре сыра", "Моцарелла, горгонзола, пармезан, эмменталь", 12, "2 дня");

        Soup soup1 = new Soup("Борщ", "Свекла, капуста, мясо, картофель", 60, "5 дней");
        Soup soup2 = new Soup("Куриный суп", "Курица, лапша, морковь, лук", 40, "3 дня");

        System.out.println("=== ПРОЦЕСС ГОТОВКИ ===");
        Cookable[] cookables = {pizza1, pizza2, pizza3, soup1, soup2};

        for (Cookable item : cookables) {
            item.cook();
            System.out.println("Время приготовления: " + item.getCookingTime() + " минут.");
            System.out.println();
        }

        System.out.println("=== ПРОЦЕСС ХРАНЕНИЯ ===");
        Storable[] storables = {pizza1, pizza2, pizza3, soup1, soup2};

        for (Storable item : storables) {
            item.store();
            System.out.println("Срок годности: " + item.getExpirationDate());
        }
    }
}