public class FindPivotIndex {

    public static int findPivotIndex(int[] nums) {
        int totalSum = 0;
        int prefixSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        for (int i = 0; i < nums.length; i++) {
            if (prefixSum == totalSum - prefixSum - nums[i])
                return i;
            prefixSum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};

        System.out.println(findPivotIndex(nums));
    }
}
