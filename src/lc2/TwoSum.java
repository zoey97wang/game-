package lc2;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//暴力解法 双for
		public int[] twoSumForce(int[] nums, int target){
			int[] result = new int[2];
			for(int i = 0; i < nums.length; i++){
				for(int j = i+1; j < nums.length; j++){
					if(nums[i] + nums[j] == target){
						result[0] = i;
						result[1] = j;
						return result;
					}
				}
			}
			return result;
		}
		
		//with sort():
		public int[] twoSumWithSort(int[] nums, int target){
			int[] result = new int[2];
			Arrays.sort(nums);
			int left = 0;
			int right = nums.length - 1;
			while(left < right){
				if(nums[left] + nums[right] == target){
					result[0] = left;
					result[1] = right;
					return result;
				}
			}
			return result;
		}
		
		//with hashMap:
		public int[] twoSumWithHashmap(int[] nums, int target){
			int[] result = new int[2];
			// map:key: valueOfIndex;  value: currentIndex
			HashMap<Integer, Integer> map = new HashMap<>();
			for(int i = 0; i < nums.length; i++){
				if(map.containsKey(target - nums[i])){
					result[0] = map.get(target - nums[i]);
					result[1] = i;
					return result;
				}
				map.put(nums[i], i);
			}
			return result;
		}
		

}
