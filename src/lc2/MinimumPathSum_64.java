package lc2;

public class MinimumPathSum_64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int minPathSum(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        if (r == 0 || c == 0) {
            return 0;
        }
        int[][] miniSum = new int[r][c];
        miniSum[0][0] = grid[0][0];
        for (int i = 1; i < c; i++) {
            miniSum[0][i] = miniSum[0][i - 1] + grid[0][i];
        }
        for (int i = 1; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int left = (j == 0) ? Integer.MAX_VALUE : miniSum[i][j - 1];
                miniSum[i][j] = Math.min(miniSum[i - 1][j], left) 
                    + grid[i][j];
            }
        } 
        return miniSum[r - 1][c - 1];
    }

}
