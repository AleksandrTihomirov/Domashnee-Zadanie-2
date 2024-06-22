public class SumArray {
    public static int sumArray(int[] inputArray) {
        int sum = 0;
        for (int i = 0; i < inputArray.length; i++) {
            sum += inputArray[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = {15, 21, 13, 4, 45};
        int sum = sumArray(arr);
        System.out.println("Сумма элементов массива: " + sum);
    }
}