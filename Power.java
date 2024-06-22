import java.util.Scanner;

public class Power {
    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("Введите число: ");
        int base = value.nextInt();
        System.out.println("Введите степень числа: ");
        int exponent = value.nextInt();
        int result = power(base, exponent);
        System.out.println(base + " в степени " + exponent + " равно: " + result);
    }
}
