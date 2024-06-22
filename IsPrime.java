import java.util.Scanner;

public class IsPrime {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        boolean isPrime = isPrime(number);

        if (isPrime) {
            System.out.println(number + " простое число.");
        } else {
            System.out.println(number + " не является простым числом.");
        }
    }
}