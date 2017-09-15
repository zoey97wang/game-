package lc2;

import java.util.LinkedList;
import java.util.List;

public class PalindromePartitioning_131 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	class Solution {
	    List<List<String>> result = new LinkedList<List<String>>();
	    public List<List<String>> partition(String s) {
	        List<String> part = new LinkedList<String> ();
	        population(part, s, 0);
	        return result;
	    }
	    
	    public void population(List<String> row, String s, int begin) {
	        if(begin == s.length()) {
	            List<String> l = new LinkedList();
	            for (String t : row) {
	                l.add(t);
	            }
	            result.add(l);
	            return;
	        }
	        for (int i = begin; i < s.length(); i++) {
	            if (isPalindrome(begin, i, s)) {
	                row.add(s.substring(begin, i + 1));
	                population(row, s, i + 1);
	                row.remove(row.size() - 1);
	            }
	        }
	    }
	    
	    public boolean isPalindrome(int begin, int end, String s) {
	        while (begin < end) {
	            if (s.charAt(begin) != s.charAt(end)) {
	                return false;
	            }
	            begin++;
	            end--;
	        }
	        return true;
	    }
	}
}
