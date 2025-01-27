package partition_array_into_disjoint_interval;

public class Main {
    public int partitionDisjoint(int[] nums) {
        int n = nums.length;
        int maxLeft = nums[0];
        int globalMax = nums[0];
        int partitionIndex = 0;

        for (int i = 1; i < n; i++) {
            if (nums[i] < maxLeft) {
                partitionIndex = i;
                maxLeft = globalMax;
            } else {
                globalMax = Math.max(globalMax, nums[i]);
            }
        }

        return partitionIndex + 1;
    }

    public static void main(String[] args) {
        int[] nums = {10, 0, 3, 8, 6};

        Main solution = new Main();
        int result = solution.partitionDisjoint(nums);

        System.out.println("Panjang subarray left: " + result);
    }
}
