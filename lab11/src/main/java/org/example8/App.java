package org.example8;

public class App {
    public static void main(String[] args) {
        Plant plant = new Plant("Ромашка", 20.5, "Цветок");
        plant.water();
        plant.water(5);
        plant.water("утром");
        System.out.println();

        Tree tree = new Tree("Дуб", 150.0, "Дерево", 30);
        Flower flower = new Flower("Роза", 45.5, "Цветок", "Красный");

        tree.grow();
        flower.grow();
        System.out.println();

        Plant[] plants = {plant, tree, flower};
        for (Plant p : plants) {
            p.grow();
        }
        System.out.println();


        for (Plant p : plants) {
            if (p instanceof Tree) {
                Tree t = (Tree) p;
                System.out.println("Это дерево, возраст: " + t.getAge());
            } else if (p instanceof Flower) {
                Flower f = (Flower) p;
                System.out.println("Это цветок, цвет: " + f.getColor());
            } else {
                System.out.println("Это обычное растение: " + p.getName());
            }
        }
    }
}

