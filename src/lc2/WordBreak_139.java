package lc2;

import java.util.List;

public class WordBreak_139 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean wordBreak(String s, List<String> wordDict) {
        int maxLen = 0;
        for (String item : wordDict) {
            maxLen = Math.max(item.length(), maxLen);
        }
        int len = s.length();
        boolean[] isSeg = new boolean[len + 1];
        isSeg[0] = true;
        for (int current = 1; current <= len; current++) {
            for (int pre = current - 1; pre >= 0 && pre >= current - maxLen; pre--) {
                if (isSeg[pre] == true) {
                    if (wordDict.contains(s.substring(pre, current))) {
                        isSeg[current] = true;
                    }
                }
            }
        }
        return isSeg[len];
    }

}
