class Solution {
    public int findNumbers(int[] nums) {
        int even = 0;
        for(int i=0; i<nums.length; i++) {
            int digit = nums[i], curr = 0;
            while(digit > 0) {
                digit /= 10;
                curr++;
            }
            if(curr % 2 == 0) {
                even++;
            }
        }
        return even;
    }
}