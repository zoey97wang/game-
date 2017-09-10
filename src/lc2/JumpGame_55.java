package lc2;

public class JumpGame_55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[1];
		System.out.println(a[0]);
		
	}
	
	//time limit
	public boolean canJump(int[] nums) {
        int len = nums.length;
        boolean[] flag = new boolean[len];
        flag[0] = true;
        for (int i = 0; i < len; i++) {
            int count = nums[i];
            if (flag[i]) {
                while (count > 0) {
                    if (count + i >= len) {
                        return true;
                    }
                    flag[i + count] = true;
                    count--;
                }
            }
        }
        return flag[len - 1];
    }
	
	public boolean canJump2(int[] nums) {
        int len = nums.length;
        boolean[] flag = new boolean[len];
        flag[0] = true;
        for (int i = 0; i < len; i++) {
            if (!flag[i]) {
                for (int j = i - 1; j >= 0; j--) {
                    if (j + nums[j] >= i) {
                        flag[i] = true;
                        break;
                    }
                }
            }
            if (!flag[i]) {
                   return false;
               }
        }
        return true;
    }

}
