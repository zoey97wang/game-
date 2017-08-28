package lc2;

public class BeautifulArrangementII_667 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int[] constructArray(int n, int k) {
        int[] result = new int[n];
        if (k >= n) {
            return result;
        }
        int begin = 1;
        int end = 1 + k;
        for (int i = end; i < n; i++) {
            result[i] = i + 1;
        }
        int i = 0;
        while (begin < end) {
            result[i++] = begin;
            result[i++] = end;
            begin++;
            end--;
        }
        if (begin == end) {
            result[i] = begin;
        }
        return result;
    }

}
