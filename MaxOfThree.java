import java.util.Scanner;

public class MaxOfThree {
    public static int maxOfThree(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        System.out.println("Максимальное число будет: " + max);
        return max;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите три числа");

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int maxValue = maxOfThree(a, b, c);
    }
}