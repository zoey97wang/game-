package lc2;

public class MaxAreaofIsland_695 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        int len = grid.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (grid[i][j] == 1) {
                    max = Math.max(max, dfs(grid, i, j));
                }
            }
        }
        return max;
    }
    public int dfs(int[][] grid, int i, int j) {
        if (i >= 0 && i < grid.length && j >= 0 && j < grid.length && grid[i][j] == 1) {
            grid[i][j] = 0;
            return 1 + dfs(grid, i - 1, j) + dfs(grid, i ,j - 1) + dfs(grid, i + 1, j) + dfs(grid, i, j + 1);
        }
        return 0;
    }

}
