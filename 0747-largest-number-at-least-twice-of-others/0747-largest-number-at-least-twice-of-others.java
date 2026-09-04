class Solution {
    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE, idx = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] > max) {
                max = nums[i];
                idx = i;
            }
        }

        for(int n : nums) {
            if(n * 2 > max && n != max) {
                return -1;
            }
        }
        return idx;
    }
}