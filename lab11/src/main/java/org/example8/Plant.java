package org.example8;

class Plant {
    private String name;
    private double height;
    private String type;

    public Plant(String name, double height, String type) {
        this.name = name;
        this.height = height;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public String getType() {
        return type;
    }

    public void water() {
        System.out.println("Поливаю растение");
    }

    public void water(int liters) {
        System.out.println("Поливаю " + liters + " литрами");
    }

    public void water(String time) {
        System.out.println("Поливаю в " + time);
    }

    public void grow() {
        System.out.println("Растет медленно");
    }
}
