package edu.elac;

import java.util.Arrays;

/**
 * <p>
 *
 * @description: </p>
 * @author: David
 * @create: 2024-02-05 10:43
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] array = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
//        int[] array = {1, 1, 2};
        System.out.println(removeDuplicates(array));
        System.out.println(Arrays.toString(array));
    }

    public static int removeDuplicates(int[] nums) {
        int i = 1;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i-1] != nums[j]) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }




}