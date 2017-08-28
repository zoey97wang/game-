package lc2;

public class NondecreasingArray_665 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean checkPossibility(int[] nums) {
        int tag = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i+1]) {
                tag++;
                if (i != 0 && nums[i-1] > nums[i+1])
                    nums[i + 1] = nums[i];
                if (tag == 2)
                    return false;
            }
        }
        return true;
    }

}
