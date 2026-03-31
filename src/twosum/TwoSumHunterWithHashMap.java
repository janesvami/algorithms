package twosum;

import java.util.HashMap;

public class TwoSumHunterWithHashMap implements TwoSumHunter {

    @Override
    public int[] findTwoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int complement = target - current;
            if (map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            } else {
                map.put(arr[i], i);
            }
        }
        return new int[0];
    }
}