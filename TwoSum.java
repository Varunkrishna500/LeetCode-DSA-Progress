import java.util.Arrays;
public class TwoSum {
    public static int[] twosum(int[] nums, int target) {
        int x = nums.length;
        for (int i = 0; i < x; i++) {
            for (int j = i + 1; j < x; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 14 };
        int target = 21;
        int[] result = twosum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
