package org.example;

public abstract class CelestialBody {
    private String name;
    private double mass;
    private double diameter;


    public CelestialBody(String name, double mass, double diameter) {

        this.name = name;
        this.mass = mass;
        this.diameter = diameter;

    }

    public String getName() {

        return name;
    }


    public double getMass() {
        return mass;
    }


    public double getDiameter() {
        return diameter;
    }
    public static class Plane extends CelestialBody {
        public Plane(String name, double mass, double diameter) {
            super(name, mass, diameter);
        }

        @Override
        public String getType() { return "Планета"; }

        @Override
        public double calculateGravity() { return 9.8; }

        public void createObj() {
            Plane obj = new Plane("Земля", 5.97, 12742);
            obj.displayInfo();
        }
    }

        public abstract String getType();
    public abstract double calculateGravity();


    public void displayInfo() {
        System.out.println("Тип: " + getType() + ", Название: " + name + ", Масса: " + mass + ", Диаметр: " + diameter);
    }
}