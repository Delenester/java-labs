package org.example;

public class Planet extends CelestialBody {
    private int moons;

    public Planet(String name, double mass, double diameter, int moons) {
        super(name, mass, diameter);
        this.moons = moons;
    }

    public int getMoons() {
        return moons;
    }

    @Override
    public String getType() {
        return "Планета";
    }

    @Override
    public double calculateGravity() {
        double radius = getDiameter() / 2.0;
        return 9.8 * (getMass() / (radius * radius));
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(moons);
    }
}