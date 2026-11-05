package org.example8;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Любимый фильм (информация о файле + чтение)");
            System.out.println("2. 10 целых чисел в файл, сумма положительных");
            System.out.println("3. Случайные числа: остаток 1 при делении на 3");
            System.out.println("4. Рост учеников, средний рост");
            System.out.println("5. Числа больше 50 из файла");
            System.out.println("0. Выход");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    try (FileWriter writer = new FileWriter("film.txt")) {
                        writer.write("Название: Декстер\n");
                        writer.write("Год: 2006\n");
                        writer.write("Режиссёр: Джеймс Маноски младший\n");
                        writer.write("Жанр: Драма, триллер\n");
                    } catch (IOException e) {
                        System.out.println("Ошибка записи: " + e.getMessage());
                    }

                    File film = new File("film.txt");
                    System.out.println("\n--- Информация о файле ---");
                    System.out.println("Имя: " + film.getName());
                    System.out.println("Размер: " + film.length() + " байт");
                    System.out.println("Путь: " + film.getAbsolutePath());
                    System.out.println("Существует: " + film.exists());

                    System.out.println("\nСодержимое файла");
                    try (FileReader reader = new FileReader("film.txt")) {
                        int c;
                        while ((c = reader.read()) != -1) {
                            System.out.print((char) c);
                        }
                    } catch (IOException e) {
                        System.out.println("Ошибка чтения: " + e.getMessage());
                    }
                    break;

                case 2:
                    try (FileWriter writer = new FileWriter("numbers.txt")) {
                        System.out.println("Введите 10 целых чисел:");
                        for (int i = 0; i < 10; i++) {
                            System.out.print((i + 1) + ": ");
                            int n = scanner.nextInt();
                            writer.write(n + "\n");
                        }
                    } catch (IOException e) {
                        System.out.println("Ошибка записи: " + e.getMessage());
                    }
                    scanner.nextLine();

                    int sum = 0;
                    System.out.println("\nЧисла из файла:");
                    try (BufferedReader reader = new BufferedReader(new FileReader("numbers.txt"))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            int n = Integer.parseInt(line);
                            System.out.print(n + " ");
                            if (n > 0) sum += n;
                        }
                    } catch (IOException e) {
                        System.out.println("Ошибка чтения: " + e.getMessage());
                    }
                    System.out.println("\nСумма положительных: " + sum);
                    break;

                case 3:
                    Random random = new Random();
                    try (FileWriter f = new FileWriter("f.txt");
                         FileWriter g = new FileWriter("g.txt");
                         FileWriter h = new FileWriter("h.txt")) {

                        for (int i = 0; i < 20; i++) {
                            int n = random.nextInt(100);
                            f.write(n + "\n");
                            if (n % 3 == 1) {
                                g.write(n + "\n");
                            } else {
                                h.write(n + "\n");
                            }
                        }
                    } catch (IOException e) {
                        System.out.println("Ошибка записи: " + e.getMessage());
                    }
                    System.out.println("Файлы f.txt, g.txt, h.txt созданы.");
                    break;

                case 4:
                    try (FileWriter writer = new FileWriter("growth.txt")) {
                        System.out.println("Введите 14 значений роста (см):");
                        for (int i = 0; i < 5; i++) {
                            System.out.print((i + 1) + ": ");
                            double h = scanner.nextDouble();
                            writer.write(h + "\n");
                        }
                    } catch (IOException e) {
                        System.out.println("Ошибка записи: " + e.getMessage());
                    }
                    scanner.nextLine();

                    double total = 0;
                    int count = 0;
                    try (BufferedReader reader = new BufferedReader(new FileReader("growth.txt"))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            total += Double.parseDouble(line);
                            count++;
                        }
                    } catch (IOException e) {
                        System.out.println("Ошибка чтения: " + e.getMessage());
                    }
                    System.out.printf("Средний рост: %.2f см%n", total / count);
                    break;

                case 5:
                    try (FileWriter writer = new FileWriter("f2.txt")) {
                        Random r = new Random();
                        for (int i = 0; i < 10; i++) {
                            writer.write(r.nextInt(100) + "\n");
                        }
                    } catch (IOException e) {
                        System.out.println("Ошибка записи: " + e.getMessage());
                    }

                    int bigCount = 0;
                    System.out.println("Числа из файла:");
                    try (BufferedReader reader = new BufferedReader(new FileReader("f2.txt"))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            int n = Integer.parseInt(line);
                            System.out.print(n + " ");
                            if (n > 50) bigCount++;
                        }
                    } catch (IOException e) {
                        System.out.println("Ошибка чтения: " + e.getMessage());
                    }
                    System.out.println("\nЧисел больше 50: " + bigCount);
                    break;

                case 0:
                    System.out.println("Выход.");
                    break;

                default:
                    System.out.println("Неверный ввод.");
            }
        } while (choice != 0);

        scanner.close();
    }
}