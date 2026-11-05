package org.example8;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<Athlete> team = new ArrayList<>();

        try {
            Athlete a1 = new Athlete("Иван",   "Плавание",   2, -5, 8.5);
            Athlete a2 = new Athlete("Анна",   "Гимнастика", 19, 7, 9.2);
            Athlete a3 = new Athlete("Сергей", "Бег",        25, 3, 7.8);
            team.add(a1);
            team.add(a2);
            team.add(a3);

            try { a1.setAge(5); }
            catch (InvalidAthleteDataException e) { System.out.println("Ошибка возраста: " + e.getMessage()); }

            try { a2.setMedals(-3); }
            catch (InvalidAthleteDataException e) { System.out.println("Ошибка медалей: " + e.getMessage()); }

            try { a3.setRating(15); }
            catch (MedalUpdateException e) { System.out.println("Ошибка рейтинга: " + e.getMessage()); }

            try {
                a1.addMedal();
                a1.updateRating(9.1);
            } catch (MedalUpdateException e) {
                System.out.println("Ошибка обновления: " + e.getMessage());
            }

            System.out.println();
            team.forEach(System.out::println);

        } catch (InvalidAthleteDataException | MedalUpdateException e) {
            System.out.println("Ошибка при создании: " + e.getMessage());
        }
    }
}