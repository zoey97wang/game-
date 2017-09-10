package lc2;

public class NumberofLongestIncreasingSubsequence_673 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int findNumberOfLIS(int[] nums) {
        int len = nums.length;
        if (len < 2) {
            return len;
        }
        int[] m = new int[len];
        int result = 0;
        m[0] = 1;
        int max = 1;
        for (int i = 1; i < len; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if(nums[j] < nums[i]){
                    m[i] = Math.max(m[i], m[j] + 1);
                }
            }
            if (m[i] == 0) {
                m[i] = 1;
            }
            max = Math.max(max, m[i]);
        }
        int m2[] = new int[len];
        m2[0] = 1;
        for (int i = 1; i < len; i++) {
            int count = 0;
            for (int j = i - 1; j>=0;j--) {
                if(nums[j] < nums[i] && m[j] == m[i] - 1) {
                    count = count + m2[j];
                }
            }
            if (count == 0) {
                m2[i] = 1;
            } else 
                m2[i] = count;
        }
        for (int i = 0; i < len; i++) {
            if (m[i] == max) {
                result = result + m2[i];
            }
        }
        return result;
    }

}
