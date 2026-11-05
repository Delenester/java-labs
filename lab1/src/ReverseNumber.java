import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

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

        scanner.close();
    }
}