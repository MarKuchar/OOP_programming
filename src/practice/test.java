package practice;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] square = {};
        System.out.println(shiftArray(square));
    }


    public static int[] shiftArray(int[] nums) {
        // Todo: your code goes here
        if (nums.length <= 1) {
            return nums;
        }
        int cop[] = new int[nums.length];
        cop[nums.length - 1] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            cop[i - 1] += nums[i];
        }
        System.out.println(nums[nums.length - 1]);
        // System.arraycopy(nums, 1, cop, 0, nums.length - 2);
        return cop;
    }
}




