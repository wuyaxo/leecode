package edu.elac;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * <p>
 *
 * @description: </p>
 * @author: David
 * @create: 2024-02-01 12:04
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
//        for (int i = 0; i < nums.length; i++) {
//            map.put(nums[i], i);
//        }

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff) && map.get(diff) != i) {
                result[0] = i;
                result[1] = map.get(diff);
                break;
            }
            map.put(nums[i], i);
        }
        return result;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{3, 3};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}