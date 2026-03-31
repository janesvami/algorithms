package twosum;

public class TwoSumHunterWithTwoCounters implements TwoSumHunter {

    @Override
    public int[] findTwoSum(int[] arr, int target) {
        if (arr == null || arr.length < 2) {
            return new int[0];
        }

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[0];
    }
}
