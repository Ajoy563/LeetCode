class Solution {
    public int removeElement(int[] nums, int val) {
        int idx = 0, cntVal = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != val) {
                nums[idx] = nums[i];
                idx++;
            }
            else {
                cntVal++;
            }
        }
        //nums = Arrays.copyOfRange(nums, 0, cntVal);
        return nums.length - cntVal;
    }
}