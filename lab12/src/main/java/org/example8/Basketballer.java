package org.example8;

public class Basketballer extends Athlete {
    private int points;

    public Basketballer(String name, int id, int medals, int points) {
        super(name, id, medals);
        this.points = points;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", ", points=" + points + "}");
    }
}