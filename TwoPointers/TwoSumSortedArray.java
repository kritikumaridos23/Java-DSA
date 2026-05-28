package TwoPointers;
import java.util.Arrays;
public class TwoSumSortedArray {
    public static int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[] { left + 1, right + 1 }; // 1-based indexing
            }
            else if (sum < target) {
                left++;
            }
            else {
                right--;
            }
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Target: " + target);
        System.out.println("Result Indexes: " + Arrays.toString(result));
    }
}
