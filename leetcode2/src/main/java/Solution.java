import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }

        throw new IllegalArgumentException("No two sum solution");
    }

public static void main(String[] args) {
        Solution s = new Solution();
        int[] result = s.twoSum(new int[] {2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(result));
    }
}
