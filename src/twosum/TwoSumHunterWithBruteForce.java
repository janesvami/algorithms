package twosum;

public class TwoSumHunterWithBruteForce implements TwoSumHunter {
    @Override
    public int[] findTwoSum(int[] arr, int target) {
        if (arr == null || arr.length < 2) {
            return new int[0];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}
