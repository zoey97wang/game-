package lc2;

public class PalindromePatitioningII_132 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(minCut2("cabababcbc"));
		
	}
	
	
	public static int minCut2(String s) {
        int len = s.length();
        if (len < 2) {
            return 0;
        }
        boolean[][] isPal = new boolean[len + 1][len + 1];
        isPal[0][0] = true;
        for (int i = 1; i <= len; i++) {
            for (int j = 1; j <= i; j++) {
                if (s.charAt(i - 1) == s.charAt(j - 1) && 
                    (i - j <= 2 || isPal[j + 1][i - 1] == true)) {
                    isPal[j][i] = true;
                }
            }
        }
        
        for (int i = 1; i <= len; i++) {
            for (int j = 1; j <= len; j++) {
            	System.out.print(isPal[i][j] + " ");
            	
            }
            System.out.println();
        }
        
        int[] value = new int[len + 1];
        value[0] = -1;
        for (int i = 1; i <= len; i++) {
            value[i] = Integer.MAX_VALUE;
            for (int l = 1, r = i ; l <= r; r--, l++) {
                if (isPal[l][i]) {
                    value[i] = Math.min((value[l - 1] + 1), value[i]);
                    if (value[l - 1] == 0){
                        break;
                    }
                }
                if (isPal[r][i]) {
                    value[i] = Math.min((value[r - 1] + 1), value[i]);
                    if (value[r - 1] == 0){
                        break;
                    }
                }
            }
        }
        for (int i = 0; i <= len; i++) {
        	System.out.println(value[i]);
        }
        return value[len];
    }
	

	public static int minCut(String s) {
        int len = s.length();
        if (len < 2) {
            return 0;
        }
        int[] value = new int[len + 1];
        value[0] = -1;
        for (int i = 1; i <= len; i++) {
            value[i] = Integer.MAX_VALUE;
            for (int l = 1, r = i ; l <= i && r > 0; r--, l++) {
            	if (isPalindrome(s, l - 1, i - 1)) {
                    value[i] = Math.min((value[l - 1] + 1), value[i]);
                    if (value[l - 1] == 0){
                        break;
                    }
                }
                System.out.println("l "+l+" i "+i);
                if (isPalindrome(s, r - 1, i - 1)) {
                    value[i] = Math.min((value[r - 1] + 1), value[i]);
                    if (value[r - 1] == 0){
                        break;
                    }
                }
                System.out.println("r "+r+" i "+i);
            }
        }
        return value[len];
    }
    public static boolean isPalindrome(String s, int begin, int end) {
        while (begin < end) {
            if (s.charAt(begin) == s.charAt(end)) {
                begin++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }
}
