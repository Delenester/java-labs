package org.example;

public class App {
    public static void main(String[] args) {
        University u1 = new University("БГУ", 20000, 15);
        University u2 = new University("БНТУ", 18000, 12);
        University u3 = new University("БГЭУ", 12000, 10);

        System.out.println("Всего университетов: " + University.getTotalUniversities());
        System.out.println("Всего студентов: " + University.getTotalStudents());
        System.out.printf("Среднее число студентов: %.2f%n", University.getAverageStudents());
    }
}

