package easy;

/**
 * <h3>Remove Element</h3>
 * <p>
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
 * Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
 * Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
 * Return k.
 * <p>
 * Input: nums = [3,2,2,3], val = 3
 * Output: 2, nums = [2,2,_,_]
 * */
public class RemoveElement {

    private static int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length - 1;

        while(left < right) {
            if(nums[left] == val) {
                nums[left] = nums[right];
                right--;
            } else {
                left++;
            }
        } return left;// returning length after removing elements
    }

    public static void main(String[] args) {
        int[] nums = {3,2,2,3}; // Input array
        int val = 3; // Value to remove

        System.out.println(removeElement(nums, val));
    }
}
