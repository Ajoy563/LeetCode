class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder("");
        for(int i=0; i<s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
                str.append(ch);
            }
        }

        int l = 0, r = str.length() - 1;
        while(l < r) {
            if(str.charAt(l) != str.charAt(r)) return false;
            l++; r--; 
        }
        return true;
    }
}