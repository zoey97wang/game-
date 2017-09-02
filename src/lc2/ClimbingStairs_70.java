package lc2;

public class ClimbingStairs_70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int climbStairs(int n) {
        if (n <= 1) {
            return n;
        }
        int[] result = new int[n];
        result[0] = 1;
        result[1] = 2;
        for (int i = 2; i < n; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result[n - 1];
    }

}
