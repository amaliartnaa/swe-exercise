import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoProduct(int[] nums, int target) {
        Map <Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (target % nums[i] == 0) {
                int complement = target / nums[i];

                if (map.containsKey(complement)) {
                    return new int[] {
                            map.get(complement), i
                    };
                }
            }

            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No Solution Exists");
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {2, 4, 6, 8};
        int target = 32;

        try {
            int[] result = solution.twoProduct(nums, target);
            System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}