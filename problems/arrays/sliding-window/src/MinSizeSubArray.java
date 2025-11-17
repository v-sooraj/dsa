public class MinSizeSubArray {

    public static int minSubArrayLen(int target, int[] nums) {

        int sum = 0;
        int minLength = Integer.MAX_VALUE;
        int start = 0;

        for (int end = 0; end < nums.length; end++) {
            sum += nums[end];

            while(sum >= target) {
                minLength = Math.min(minLength, end - start + 1);
                sum -= nums[start];
                start++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    public static void main(String[] args) {
        int target = 7;
        int[] nums = {2,3,1,2,4,3};

        System.out.println(minSubArrayLen(target, nums));
    }
}
