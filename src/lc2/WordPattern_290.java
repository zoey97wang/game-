package lc2;

import java.util.HashMap;
import java.util.HashSet;

public class WordPattern_290 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean wordPattern(String pattern, String str) {
        HashSet<String> alreadyExist = new HashSet();
        HashMap<Character, String> existPattern = new HashMap();
        char[] p = pattern.toCharArray();
        String[] s = str.split(" ");
        if (p.length != s.length) {
            return false;
        }
        for (int i = 0; i < p.length; i++) {
            if (!alreadyExist.add(s[i])) {
                if (existPattern.containsKey(p[i])) {
                    if(!existPattern.get(p[i]).equals(s[i])) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if(existPattern.containsKey(p[i])) {
                    return false;
                }
                existPattern.put(p[i], s[i]);
            }
        }
        return true;
    }

}
