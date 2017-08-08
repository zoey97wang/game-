package lc2;

public class LetterCombinationsofaPhoneNumber_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println('5' - '0');

	}

	
}

public class Solution {
    HashMap<Integer, String> mp;
    public List<String> letterCombinations(String digits) {
        populateHashMap();
        List<String> result = new LinkedList();
        for(int i = 0; i < digits.length(); i++){
            int key = digits.charAt(i) - '0';
            String s = mp.get(key);
            if(result.size() == 0){
                for(int k = 0; k < s.length(); k++){
                    result.add(s.charAt(k)+"");
                }
            }else{
                int len = result.size();
                int flag = s.length();
                for(int j = 1; j < flag; j++){
                    for(int y = 0; y < len; y++){
                        result.add(result.get(y) + s.charAt(j));
                    }
                }
                for(int y = 0; y < len; y++){
                    result.set(y, result.get(y) + s.charAt(0));
                }
            }
        }
        return result;
    }
    public void populateHashMap(){
        mp = new HashMap<Integer, String>();
        mp.put(2, "abc");
        mp.put(3, "def");
        mp.put(4, "ghi");
        mp.put(5, "jkl");
        mp.put(6, "mno");
        mp.put(7, "pqrs");
        mp.put(8, "tuv");
        mp.put(9, "wxyz");
        mp.put(0, " ");
    }
}
