import java.util.Scanner;

public class switc {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.println();
            System.out.println("1 - Площадь круга");
            System.out.println("2 - Проверка треугольника");
            System.out.println("3 - Переворот числа");
            System.out.println("4 - Страна");
            System.out.println("0 - Выход");


            choice = scanner.nextInt();

            switch (choice) {

                case 1: {
                    System.out.print("Введите радиус круга R: ");
                    double radius = scanner.nextDouble();

                    double area = Math.PI * radius * radius;

                    System.out.println("Радиус круга R = " + radius);
                    System.out.println("Площадь круга S = " + area);
                    break;
                }

                case 2: {
                    System.out.print("Введите сторону a: ");
                    double a = scanner.nextDouble();

                    System.out.print("Введите сторону b: ");
                    double b = scanner.nextDouble();

                    System.out.print("Введите сторону c: ");
                    double c = scanner.nextDouble();

                    if (a + b > c && a + c > b && b + c > a) {
                        System.out.println("Треугольник со сторонами " + a + ", " + b + ", " + c + " существует.");
                    } else {
                        System.out.println("Треугольник со сторонами " + a + ", " + b + ", " + c + " НЕ существует.");
                    }
                    break;
                }

                case 3: {
                    System.out.print("Введите целое число: ");
                    long number = scanner.nextLong();

                    long original = number;
                    long reversed = 0;

                    while (number != 0) {
                        long digit = number % 10;
                        reversed = reversed * 10 + digit;
                        number = number / 10;
                    }

                    System.out.println("Исходное число: " + original);
                    System.out.println("Перевернутое число: " + reversed);
                    break;
                }
                case 4: {
                    System.out.print("Введите страну: ");


                    String f = scanner.next();
                    switch (f){
                        case "Беларусь":{
                            System.out.println("Минск");
                            break;
                        }
                        case "Россия":{
                            System.out.println("Москва");
                            break;
                        }
                        default:{
                            System.out.println("Неверный выбор! Введите  Беларусь или Россия");

                        }

                    }


                    break;

                }

                case 0: {
                    System.out.println("Выход из программы.");
                    break;
                }

                default: {
                    System.out.println("Неверный выбор! Введите 0, 1, 2,3 или 4");
                }
            }

        } while (choice != 0);

        scanner.close();
    }
}