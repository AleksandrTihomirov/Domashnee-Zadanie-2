import java.util.Random;
import java.util.Scanner;

public class UgadaiChislo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int max = 100;
        int randomNumber = random.nextInt(100) + 1;

        System.out.println(randomNumber);
        System.out.println("Угадайте число от 0 до " + max);

        while (true) {
            int Number = scanner.nextInt();
            if (Number > randomNumber) {
                System.out.println("Введенное число больше");
            }
            if (Number < randomNumber) {
                System.out.println("Введенное число меньше");
            }
            if (Number == randomNumber) {
                System.out.println("Вы угадали");
                break;
            }
        }
    }
}
