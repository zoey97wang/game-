package lc2;

import java.util.LinkedList;
import java.util.List;

public class ImplementMagicDictionary_676 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	class MagicDictionary {
	    
	    List<String> dic;

	    /** Initialize your data structure here. */
	    public MagicDictionary() {
	        dic = new LinkedList<String>();
	    }
	    
	    /** Build a dictionary through a list of words */
	    public void buildDict(String[] dict) {
	        for (String s : dict) {
	            dic.add(s);
	        }
	    }
	    
	    public boolean search(String word) {
	        int len = word.length();
	        for (int i = 0; i < dic.size(); i++) {
	            if (dic.get(i).length() == len) {
	                String temp = dic.get(i);
	                int flag = 0;
	                for (int j = 0; j < len; j++) {
	                    if (temp.charAt(j) != word.charAt(j)) {
	                        flag++;
	                    }
	                }
	                if (flag == 1) {
	                    return true;
	                }
	            }
	        }
	        return false;
	    }
	}

}
