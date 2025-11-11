/**
 * Given an integer array nums, handle multiple queries of the following type:
 * Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
 * Implement the NumArray class:
 * NumArray(int[] nums) Initializes the object with the integer array nums.
 * int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).*/
public class NumArray {

    private final int[] prefixSum;

    public NumArray(int[] nums){
        prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = prefixSum[i-1] + nums[i];
        }
        // prefixSum[i] now stores the sum of nums[0] to nums[i]
        // Alternate approach: use a prefixSum array of size nums.length + 1
        // with prefixSum[0] = 0 to avoid the 'if(left == 0)' check
    }

    public int sumRange(int left, int right) {
        // If left == 0, return prefixSum[right] directly
        // because prefixSum[-1] does not exist
        if (left == 0) return prefixSum[right];
        return prefixSum[right] - prefixSum[left - 1];
    }

}
