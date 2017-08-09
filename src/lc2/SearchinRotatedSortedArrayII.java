package lc2;

public class SearchinRotatedSortedArrayII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean search(int[] nums, int target) {
        int len = nums.length;
        if(len < 1)
            return false;
        int begin = 0;
        int end = len - 1;
        while(begin + 1 < end){
            int mid = begin + (end - begin)/2;
            if(nums[mid] == target){
                return true;
            }else if(nums[mid] == nums[0] && nums[mid] == nums[len - 1]){
                end--;
                begin++;
                if(nums[begin] == target)
                    return true;
                else if(nums[end] == target)
                    return true;
            }else if(nums[len -1] < target){
                if(nums[mid] > target){
                    end = mid;
                }else if(nums[mid] < target && nums[mid] < nums[0]){
                    end = mid;
                }else{
                    begin = mid;
                }
            }else{
                if(nums[mid] < target){
                    begin = mid;
                }else if(nums[mid] > target && nums[mid] > nums[len - 1]){
                    begin = mid;
                }else{
                    end = mid;
                } 
            }
        }
        if(nums[begin] == target)
            return true;
        else if(nums[end] == target)
            return true;
        else
            return false;
    }

}
