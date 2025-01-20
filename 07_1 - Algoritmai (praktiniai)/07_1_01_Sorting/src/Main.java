import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {8, 4, 5, 2, 6, 7, 3};
//        System.out.println(smallest(numbers));
//        System.out.println(indexOfTheSmallest(numbers));
//        System.out.println(indexOfTheSmallestStartingFrom(numbers, 3));

        System.out.println(Arrays.toString(numbers));
        sort(numbers);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (smallest > array[i]) smallest = array[i];
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        int smallest = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int smallest = array[index];
        int idx = index;
        for (int i = index + 1; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
                idx = i;
            }
        }
        return idx;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        int indexSmallest = 0;
        for (int i = 0; i < array.length; i++) {
            indexSmallest = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, indexSmallest);
        }
    }


}
