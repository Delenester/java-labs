import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Найти индекс последнего вхождения символа 'о' в строке");
            System.out.println("2. Проверить, является ли строка корректным email");
            System.out.println("3. Отчёт о зарплатах сотрудников (класс Employee, Report)");
            System.out.println("4. Найти подстроки вида 'a<цифры 2-5>a' в строке");
            System.out.println("0. Выход");
            System.out.print("Ваш выбор: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Введите строку: ");
                    String str1 = scanner.nextLine();

                    int lastIndex = str1.lastIndexOf('о');

                    if (lastIndex == -1) {
                        System.out.println("Символ 'о' в строке не найден.");
                    } else {
                        System.out.println("Индекс последнего вхождения 'о': " + lastIndex);
                    }
                    break;

                case 2:
                    System.out.print("Введите email: ");
                    String email = scanner.nextLine();

                    int atPos = email.indexOf('@');
                    int dotPos = email.indexOf('.', atPos + 1);

                    if (atPos > 0 && atPos < email.length() - 1
                            && dotPos > atPos + 1 && dotPos < email.length() - 1) {
                        System.out.println("Email корректный.");
                    } else {
                        System.out.println("Email НЕ корректный.");
                    }
                    break;

                case 3:
                    class Employee {
                        String fullname;
                        double salary;

                        Employee(String fullname, double salary) {
                            this.fullname = fullname;
                            this.salary = salary;
                        }
                    }


                case 4:
                    String text = "a1a a22a a333a a4444a a55555a";


                    Pattern pattern = Pattern.compile("a[2-5]+a");
                    Matcher matcher = pattern.matcher(text);

                    System.out.println("Найденные подстроки:");
                    while (matcher.find()) {
                        System.out.println(matcher.group());
                    }
                    break;

                case 0:
                    System.out.println("Выход из программы.");
                    break;

                default:
                    System.out.println("Неверный ввод. Попробуйте снова.");
            }

        } while (choice != 0);

        scanner.close();
    }
}