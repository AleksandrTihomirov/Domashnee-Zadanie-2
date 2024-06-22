import java.util.Scanner;

public class MaxOf5massive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Заполните массив");
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        int maximum = array[0];

        for (int i = 0; i < array.length; i++)
            if (maximum < array[i]) maximum = array[i];
        System.out.println("Максимальное число массива  =  " + maximum);
    }
}