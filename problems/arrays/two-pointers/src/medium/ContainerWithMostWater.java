package medium;

/**
 * <h3>Container with most water</h3>
 * <p>
 * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 * Find two lines that together with the x-axis form a container, such that the container contains the most water.
 * Return the maximum amount of water a container can store.
 * Notice that you may not slant the container.
 * <p>
 * Input: height = [1,8,6,2,5,4,8,3,7]
 * Output: 49
 * Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49*/
public class ContainerWithMostWater {

    private static int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int containerWithMostWater = 0;
        while(left < right) {
            int height = Math.min(heights[left], heights[right]);
            int width = right - left;
            int area = height * width;
            containerWithMostWater = Math.max(containerWithMostWater, area);

            if(heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        } return containerWithMostWater;
    }

    public static void main(String[] args) {
        int[] heights = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(heights));
    }
}
