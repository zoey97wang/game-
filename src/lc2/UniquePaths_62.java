package lc2;

public class UniquePaths_62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int uniquePaths(int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }
        int[][] sum = new int[m][n];
        for (int i = 0; i < n; i++) {
            sum[0][i] = 1;
        }
        for (int i = 0; i < m; i++) {
            sum[i][0] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) { 
                sum[i][j] = sum[i][j - 1] + sum[i - 1][j];;
            }
        }
        return sum[m - 1][n - 1];
    }
}
