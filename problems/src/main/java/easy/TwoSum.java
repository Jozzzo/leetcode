package easy;

import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int i, j;
        int[] result = new int[2];
        for (i = 0, j = 1; i < nums.length; i++, j++) {
            while (j < nums.length) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
                j++;
            }
            j = i + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        // Creating an object class inside main() method
        int[] nums = {1,2,3};
        int target = 3;

        // Calling the class object inside main() method
        TwoSum twoSum = new TwoSum();
        int[] ints = twoSum.twoSum(nums, target);
        Arrays.stream(ints).forEach(System.out::println);
    }
}
