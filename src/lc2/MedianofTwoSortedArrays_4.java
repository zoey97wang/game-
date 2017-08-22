package lc2;

import java.util.LinkedList;

public class MedianofTwoSortedArrays_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		double result = 0;
		LinkedList<Integer> l = new LinkedList<Integer>();
		int i = 0, j = 0;
		while (nums1.length > i || nums2.length > j) {
			int next = 0;
			if (nums1.length == i) {
				next = nums2[j];
				j++;
			} else if (nums2.length == j) {
				next = nums1[i];
				i++;
			} else {
				if (nums2[j] > nums1[i]) {
					next = nums1[i];
					i++;
				} else {
					next = nums2[j];
					j++;
				}
			}
			l.add(next);
		}
		int len = l.size();
		if (len % 2 > 0) {
			return l.get(len / 2);
		}
		return (l.get(len / 2) + l.get(len / 2 - 1)) / 2.0;
	}
	
	
	class Solution {
	    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        int total = nums1.length + nums2.length;
	        int k = total / 2;
	        if (total == 0)
	            return 0.0;
	        if (total % 2 == 0) {
	            return (findKelement(nums1, 0, nums2, 0, k) + findKelement(nums1, 0, nums2, 0, k + 1)) / 2.0;
	        } else {
	            System.out.println(k);
	            return findKelement(nums1, 0, nums2, 0, k + 1);
	        }
	    }
	    
	    public int findKelement(int[] A, int Abegin, int[] B, int Bbegin, int k) {
	        if (Abegin >= A.length) {
	            return B[Bbegin + k - 1];
	        } else if (Bbegin >= B.length) {
	            return A[Abegin + k - 1];
	        } else if (k == 1) {
	            return Math.min(A[Abegin], B[Bbegin]);
	        }
	        
	        int Akey = Abegin + k / 2 - 1;
	        int Bkey = Bbegin + k / 2 - 1;
	        
	        int AK, BK;
	        if (Akey >= A.length) {
	            AK = Integer.MAX_VALUE;
	        } else {
	            AK = A[Akey];
	        }
	        if (Bkey >= B.length) {
	            BK = Integer.MAX_VALUE;
	        } else {
	            BK = B[Bkey];
	        }
	        
	        if (AK > BK) {
	            return findKelement(A, Abegin, B, Bkey + 1, k - k / 2);
	        } else {
	            return findKelement(A, Akey + 1, B, Bbegin, k - k / 2);
	        }
	    }
	}

}
