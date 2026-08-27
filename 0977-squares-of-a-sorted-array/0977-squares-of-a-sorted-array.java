class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        int lp = 0, rp = n - 1;
        int resIdx = n-1;
        
        while(lp <= rp) {
            int leftVal =(int) Math.pow(nums[lp], 2);
            int rightVal =(int) Math.pow(nums[rp], 2);

            if(leftVal < rightVal) {
                arr[resIdx] = rightVal;
                rp--;
            }
            else {
                arr[resIdx] = leftVal;
                lp++;
            }
            resIdx--;
        }
        
        return arr;
    }
}