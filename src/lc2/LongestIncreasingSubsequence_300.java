package lc2;

public class LongestIncreasingSubsequence_300 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        if (len < 2) {
            return len;
        }
        int result = 0;
        int max[] = new int[len];
        max[0] = 1;
        for (int i = 1; i < len; i++) {
            for (int pre = i - 1; pre >= 0; pre--) {
                if (nums[pre] < nums[i]) {
                    max[i] = Math.max(max[i], max[pre] + 1);
                }
            }
            if (max[i] == 0) {
                max[i] = 1;
            }
            result = Math.max(max[i], result);
            
        }
        return result;
    }

}
