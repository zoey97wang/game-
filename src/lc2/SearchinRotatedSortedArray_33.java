package lc2;

public class SearchinRotatedSortedArray_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public int search(int[] nums, int target) {
        int len = nums.length;
        if(len < 1)
            return -1;
        int begin = 0;
        int end = len - 1;
        if(nums[end] == target)
            return end;
        else if(nums[end] < target){
            while(begin + 1 < end){
                int mid = begin + (end - begin)/2;
                if(nums[mid] == target){
                    return mid;
                }else if(nums[mid] > target){
                    end = mid;
                }else if(nums[mid] < target && nums[mid] < nums[0]){
                    end = mid;
                }else{
                    begin = mid;
                }
            }
            if(nums[begin] == target)
                return begin;
            else if(nums[begin] == target)
                return end;
            else
                return -1;
        }else{
            while(begin + 1 < end){
                int mid = begin + (end - begin)/2;
                if(nums[mid] == target){
                    return mid;
                }else if(nums[mid] < target){
                    begin = mid;
                }else if(nums[mid] > target && nums[mid] > nums[len - 1]){
                    begin = mid;
                }else{
                    end = mid;
                }
            }
            if(nums[begin] == target)
                return begin;
            else if(nums[begin] == target)
                return end;
            else
                return -1;
        }
    }

}
