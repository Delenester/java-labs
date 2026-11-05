package org.example;

public class App{
    public static void main(String[] args) {

        CelestialBody[] bodies = {
                new Planet("Земля", 5.97, 12742.0, 1),
                new Planet("Марс", 0.642, 6779.0, 2),
                new Planet("Юпитер", 1898.0, 139820.0, 95),
                new Star("Солнце", 333000.0, 1392700.0, 5500.0),
                new Star("Сириус", 682600.0, 2350000.0, 9940.0),

        };
        for (CelestialBody body : bodies) {
            body.displayInfo();
            System.out.println("Гравитация: " + body.calculateGravity());
        }

        };

    }