package easy;

import java.util.Arrays;

/**
 * <h3>Move Zeroes</h3>
 * <p>
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * Note that you must do this in-place without making a copy of the array.
 * <p>
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * */
public class MoveZeros {

    private static void moveZeros(int[] nums) {
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {// swap when right element is not zero
                if(left != right) {// Write when left element is zero
                    int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                } left++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeros(nums);
        System.out.println(Arrays.toString(nums));
    }
}
