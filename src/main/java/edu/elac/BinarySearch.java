package edu.elac;

/**
 * <p>
 *
 * @description: </p>
 * @author: David
 * @create: 2024-01-17 14:47
 */
public class BinarySearch {

    static int search(int[] array, int num) {
        int start = 0;
        int end = array.length;
        int middle = (start + end) >>> 1;
        while (start < end) {
            if (array[middle] == num) {
                return middle;
            } else if (array[middle] < num) {
                start = middle;
            } else {
                end = middle;
            }
            middle = (start + end) >>> 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11};
        int index = search(array, 8);
        System.out.println(index);
    }
}