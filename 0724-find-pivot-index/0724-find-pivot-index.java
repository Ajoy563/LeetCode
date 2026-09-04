class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0, leftSum = 0;
        for(int i=0; i<nums.length; i++) {
            totalSum += nums[i];
        }
        int rightSum = totalSum;
        for(int i=0; i<nums.length; i++) {
            if(i - 1 < 0) {
                rightSum -= nums[i];
            }
            else {
                rightSum -= nums[i];
                leftSum += nums[i-1];
            }
            //rightSum -= nums[i];
            if(leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }
}