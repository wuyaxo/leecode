package edu.elac;

import java.util.Arrays;

/**
 * <p>
 *
 * @description: </p>
 * @author: David
 * @create: 2024-02-06 17:58
 */
public class RemoveElement27 {

    public static void main(String[] args) {
        int[] array = {3, 2, 2, 3};
        System.out.println(removeElement(array, 3));
        System.out.println(Arrays.toString(array));
    }

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                i++;
                nums[i - 1] = nums[j];
            }
        }
        return i;
    }



}