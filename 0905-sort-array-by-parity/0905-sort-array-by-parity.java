class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int e = 0, o = nums.length-1;
        while(e <= o) {
            if(nums[o] % 2 == 1) {
                o--;
            }
            else if(nums[e] % 2 == 0) {
                e++;
            }
            else {
                int temp = nums[e];
                nums[e] = nums[o];
                nums[o] = temp;
                e++; o--;
            }
        }
        return nums;
    }
}