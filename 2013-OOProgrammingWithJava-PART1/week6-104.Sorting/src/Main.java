
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int num : array) {
            if (smallest > num) {
                smallest = num;
            }
        }

        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        int smallest = array[0];
        int smallest_index = 0;
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
                smallest_index = i;
            }
        }

        return smallest_index;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int smallest = array[index];
        int smallest_index = index;
        for (int i = index; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
                smallest_index = i;
            }
        }

        return smallest_index;

    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = 0;
        temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    /*
    The idea of selection sorting is this:

    Move the smallest number of the array to index 0.
    Move the second smallest number to the index 1.
    Move the third smallest number to the index 2.
    and so forth
    
    In other words:

    Inspect the array starting from index 0. Swap the value in index 0 and the smallest value in the array starting from index 0.
    Inspect the array starting from index 1. Swap the value in index 1 and the smallest value in the array starting from index 1.
    Inspect the array starting from index 2. Swap the value in index 2 and the smallest value in the array starting from index 2.
    and so forth

     */
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            swap(array, i, indexOfTheSmallestStartingFrom(array, i));
        }
    }
}
