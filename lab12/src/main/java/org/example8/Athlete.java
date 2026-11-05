package org.example8;

public abstract class Athlete {
    protected String name;
    protected int id;
    protected int medals;

    public Athlete(String name, int id, int medals) {
        this.name = name;
        this.id = id;
        this.medals = medals;
    }

    @Override
    public String toString() {
        return String.format("%s{name='%s', id=%d, medals=%d}",
                getClass().getSimpleName(), name, id, medals);
    }
}