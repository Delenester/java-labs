package org.example8;

public class Athlete {
    private String name, sport;
    private int age, medals;
    private double rating;

    public Athlete(String name, String sport, int age, int medals, double rating) throws InvalidAthleteDataException, MedalUpdateException {
        this.name = name;
        this.sport = sport;
        setAge(age);
        setMedals(medals);
        setRating(rating);
    }

    public String getName() { return name; }

    public int getAge() { return age; }
    public int getMedals() { return medals; }
    public double getRating() { return rating; }



    public void setAge(int age) throws InvalidAthleteDataException {
        if (age < 10 || age > 80)
            throw new InvalidAthleteDataException("Возраст 10-80: " + age);
        this.age = age;
    }

    public void setMedals(int medals) throws InvalidAthleteDataException {
        if (medals < 0)
            throw new InvalidAthleteDataException("Медали >= 0: " + medals);
        this.medals = medals;
    }

    public void setRating(double rating) throws MedalUpdateException {
        if (rating < 0 || rating > 10)
            throw new MedalUpdateException("Рейтинг 0-10: " + rating);
        this.rating = rating;
    }



    public void addMedal() throws MedalUpdateException {
        if (medals < 0)
            throw new MedalUpdateException("Отрицательные медали");
        medals++;
    }

    public void updateRating(double r) throws MedalUpdateException {
        if (r < 0 || r > 10)
            throw new MedalUpdateException("Рейтинг 0-10: " + r);
        rating = r;
    }

    @Override
    public String toString() {
        return name + " (" + sport + "), возраст=" + age
                + ", медали=" + medals + ", рейтинг=" + rating;
    }
}