class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minL = Integer.MAX_VALUE, currL = 0;
        int i = 0, j = 1;

        int sum = nums[0];
        while(i < nums.length) {
            while(j < nums.length && sum < target) {
                sum += nums[j];
                j++;
            }
            if(sum >= target) {
                minL = Math.min(minL, j - i);
                sum -= nums[i];
            }
            i++;
        }
        if(minL == Integer.MAX_VALUE) {
            return 0;
        }
        return minL;
    }
}