import java.util.Arrays;

class Solution {
    public int[] threeSum(int[] nums, int target) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == target) {
                    return new int[] { i, left, right };
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        throw new IllegalArgumentException("No Solution Exists");
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {2, 7, 11, 15};
        int target = 20;

        try {
            int[] result = solution.threeSum(nums, target);
            System.out.println("Index: " + Arrays.toString(result));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}