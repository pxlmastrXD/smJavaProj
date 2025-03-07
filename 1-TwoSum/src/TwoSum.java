import java.util.*;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        var map = new HashMap<Integer, Integer>();
        var res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            var num = nums[i];
            if (map.containsKey(num)) {
                res[0] = map.get(num);
                res[1] = i;
            } else {
                map.put(target - num, i);
            }
        }
        return res;
    }

    public boolean checker(int[] nums, int target, int[] targets) {
        var tsr = twoSum(nums, target);
        var result = false;
        if (Arrays.equals(tsr, targets)) {
            result = true;
        }
        return result;
    }
}