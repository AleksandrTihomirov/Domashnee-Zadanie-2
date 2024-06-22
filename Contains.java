public class Contains {
    public static boolean contains(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9};
        boolean contains = contains(numbers, 8);
        System.out.println("В массиве есть целое число 8 " + contains);
        contains = contains(numbers, 7);
        System.out.println("В массиве есть целое число 7 " + contains);
    }
}