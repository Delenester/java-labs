package org.example8;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Map<String, Athlete> athletes = new LinkedHashMap<>();

        athletes.put("Messi",   new Footballer("Messi", 101, 45, 700));
        athletes.put("Ronaldo", new Footballer("Ronaldo", 102, 40, 850));
        athletes.put("Mbappe",  new Footballer("Mbappe", 103, 15, 250));

        athletes.put("Jordan",  new Basketballer("Jordan", 201, 30, 32000));
        athletes.put("LeBron",  new Basketballer("LeBron", 202, 25, 38000));
        athletes.put("Curry",   new Basketballer("Curry", 203, 20, 23000));

        athletes.put("Phelps",  new Swimmer("Phelps", 301, 28, 39));
        athletes.put("Ledecky", new Swimmer("Ledecky", 302, 12, 14));

        for (Map.Entry<String, Athlete> entry : athletes.entrySet()) {
            System.out.println("Ключ: " + entry.getKey() + " -> Значение: " + entry.getValue());
        }
    }
}