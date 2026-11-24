class Solution {
    public boolean isPalindrome(int x) {
        int original = x, reverse=0;
        if(x < 0 || (x % 10 == 0 && x !=0)) 
            return false;
        while(original != 0) {
            reverse = reverse * 10 + original % 10;
            original /= 10;
        }
        return x == reverse;
    }
}