package org.example;

class Car {
    private String brand;
    private Color color;

    public Car(String brand, Color color) {
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public Color getColor() {
        return color;
    }
}
