package org.example8;

public class Footballer extends Athlete {
    private int goals;

    public Footballer(String name, int id, int medals, int goals) {
        super(name, id, medals);
        this.goals = goals;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", ", goals=" + goals + "}");
    }
}