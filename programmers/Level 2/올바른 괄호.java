class Solution {

    boolean solution(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
        	if (s.charAt(i) == '(') {
			++count;
		}
        	if (s.charAt(i) == ')') { 
        		if (count == 0) return false;
        		--count;
        	}
        }
        
        return (count == 0) ? true : false;
    }
}