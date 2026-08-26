class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOne = 0, curr = 0;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 1) {
                curr++;
            }
            else {
                maxOne = Math.max(maxOne, curr);
                curr = 0;
            }
        }
        maxOne = Math.max(maxOne, curr);
        return maxOne;
    }
}