class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i>=0; i--) {
            if(digits[i] == 9) {
                digits[i] = 0;
            }
            else {
                digits[i] += 1;
                return digits;
            }
        }
        //for [9,9] -> [0,0]
        //o/p will be [1,0,0]
        int res[] = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }
}