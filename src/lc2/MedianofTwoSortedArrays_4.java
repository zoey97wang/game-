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

}
