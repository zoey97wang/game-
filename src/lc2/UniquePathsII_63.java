package lc2;

public class UniquePathsII_63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int r = obstacleGrid.length;
        int c = obstacleGrid[0].length;
        int[][] sum = new int[r][c];
        if (r == 0 || c == 0) {
            return 0;
        }
        for (int i = 0; i < r; i++) {
            if (obstacleGrid[i][0] == 1) {
                sum[i][0] = 0;
                while (i < r) {
                    sum[i][0] = 0;
                    i++;
                }
            } else {
                sum[i][0] = 1;
            }
        }
        for (int i = 0; i < c; i++) {
            if (obstacleGrid[0][i] == 1) {
                sum[0][i] = 0;
                while (i < c) {
                    sum[0][i] = 0;
                    i++;
                }
            } else {
                sum[0][i] = 1;
            }
        }
        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {
                if (obstacleGrid[i][j] == 1) {
                    sum[i][j] = 0;
                } else {
                    sum[i][j] = sum[i - 1][j] + sum[i][j - 1];
                }
            }
        }
        return sum[r - 1][c - 1];
    }

}
