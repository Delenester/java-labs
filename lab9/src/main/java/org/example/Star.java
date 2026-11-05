package org.example;

public class Star extends CelestialBody {
    private double temperature;

    public Star(String name, double mass, double diameter, double temperature) {
        super(name, mass, diameter);
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    @Override
    public String getType() {
        return "Звезда";
    }

    @Override
    public double calculateGravity() {
        double radius = getDiameter() / 2.0;
        return 274.0 * (getMass() / (radius * radius));
    }
}