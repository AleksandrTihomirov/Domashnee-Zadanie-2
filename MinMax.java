import java.util.Scanner;

public class MinMax {
    public static int[] minMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[]{0, 0};
        }
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Задайте количество элементов массива: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Введите элементы массива: ");

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.print("Введенные элементы массива: ");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
        int[] result = minMax(array);
        System.out.println("Минимальное число в массиве: " + result[0]);
        System.out.println("Максимальное число в массиве: " + result[1]);
    }
}