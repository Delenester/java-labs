import java.util.Scanner;

public class TriangleCheck {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


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

        scanner.close();
    }
}