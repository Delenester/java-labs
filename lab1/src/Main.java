import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите радиус круга R: ");


        double radius = scanner.nextDouble();


        double area = Math.PI * radius * radius;


        System.out.println("Радиус круга R = " + radius);
        System.out.println("Площадь круга S = " + area);

        scanner.close();
    }
}