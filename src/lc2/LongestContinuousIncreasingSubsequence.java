package lc2;

public class LongestContinuousIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int findLengthOfLCIS(int[] nums) {
        int len = nums.length;
        if (len < 2) {
            return len;
        }
        int result = 0;
        for (int i = 1; i < len; i++) {
            int min = nums[i - 1];
            int l = 1;
            while (i < len && nums[i] > min) {
                l++;
                min = nums[i];
                i++;
            }
            result = Math.max(result, l);
        }
        return result;
    }
	
}
