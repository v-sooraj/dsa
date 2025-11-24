import java.util.Arrays;

public class ProductExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int arr_length = nums.length;
        int[] answer = new int[arr_length];

        answer[0] = 1; //No elements before first index, we treat its prefix product as 1
        int suffixProd = 1; // No elements after last index, we treat its suffix product as 1

        for(int i=1; i<arr_length; i++) {
            answer[i] = answer[i-1] * nums[i-1];
        }

        for(int i=arr_length-1; i>=0; i--) {
            answer[i] = answer[i] * suffixProd;
            suffixProd = suffixProd * nums[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
