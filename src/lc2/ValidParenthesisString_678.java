package lc2;

public class ValidParenthesisString_678 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean checkValidString(String s) {
        int left = 0;
        int star = 0;
        for (int i = 0; i < s.length(); i++) {
            if ( s.charAt(i) == '(' ) {
                left++;
            } else if ( s.charAt(i) == ')' ) {
                if (left > 0) {
                    left--;
                } else if (star > 0) {
                    star--;
                } else {
                    return false;
                }
            } else {
                if (left > 0) {
                    left--;
                    star++;
                }
                star++;
            }
        }
        return (left == 0);
    }
	
}
