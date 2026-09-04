class Solution {
    // public int dominantIndex(int[] nums) {
    //     int max = Integer.MIN_VALUE, idx = 0;
    //     for(int i=0; i<nums.length; i++) {
    //         if(nums[i] > max) {
    //             max = nums[i];
    //             idx = i;
    //         }
    //     }

    //     for(int n : nums) {
    //         if(n * 2 > max && n != max) {
    //             return -1;
    //         }
    //     }
    //     return idx;
    // }
    
    public int dominantIndex(int[] nums) {
        int max1 = Integer.MIN_VALUE, idx = 0, max2 = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] > max1) {
                max2 = max1;
                max1 = nums[i];
                idx = i;
            }
            else if(nums[i] > max2 && nums[i] != max1) {
                max2 = nums[i];
            }
        }

        if(max2 * 2 > max1) {
            return -1;
        }
        return idx;
    }

}