package Intervals;
import java.util.*;
public class SummaryRanges {
    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            int start = nums[i];
            while (i + 1 < nums.length &&
                   nums[i] + 1 == nums[i + 1]) {

                i++;
            }
            int end = nums[i];
            if (start == end) {
                result.add(String.valueOf(start));
            } else {
                result.add(start + "->" + end);
            }
            i++;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 4, 5, 7};
        List<String> result = summaryRanges(nums);
        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Summary Ranges: " + result);
    }
}