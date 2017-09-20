package lc2;

import java.util.LinkedList;
import java.util.List;

public class MySolution {

	List<String> result = new LinkedList<String>();
    public List<String> partition(String s) {
        String part = "";
        population(part, s, 0);
        return result;
    }
    
    public void population(String row, String s, int begin) {
        if(begin == s.length()) {
            result.add(row);
            return;
        }
        for (int i = begin; i < s.length(); i++) {
            if (isPalindrome(begin, i, s)) {
                row = row + s.substring(begin, i + 1);
                population(row, s, i + 1);
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
