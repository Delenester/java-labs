package org.example8;

class Flower extends Plant {
    private String color;

    public Flower(String name, double height, String type, String color) {
        super(name, height, type);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void grow() {
        System.out.println("Растет очень быстро");
    }
}
