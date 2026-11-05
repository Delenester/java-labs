package org.example;


public interface Cookable {

    void cook();
    int getCookingTime();
    static void printKitchenRules() {
        System.out.println("Правила кухни: соблюдайте чистоту и время готовки!");
    }
}