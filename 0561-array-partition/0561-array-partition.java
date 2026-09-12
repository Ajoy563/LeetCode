class Solution {
    // public int arrayPairSum(int[] nums) {
    //     Arrays.sort(nums);
    //     int maxSum = 0;
    //     for(int i=0; i<nums.length; i += 2) {
    //         maxSum += nums[i];
    //     }
    //     return maxSum;
    // }

    public int arrayPairSum(int[] nums) {
        //-10^4 -> 0
        // 0 -> 10^4
        // 10^4 -> 2*10^4
        int k= 10000;
        int countArr[] = new int[2 * k + 1];

        for(int i=0; i<nums.length; i++) {
            countArr[nums[i] + k]++;
        }

        // 1 4 3 2 4
        // {10001 : 1, 10002 : 1, 10003 : 2, 10004 : 2}
        int maxSum = 0;
        boolean isEvenIdx = true;
        for(int i=0; i < 2 * k + 1; i++) {
            while(countArr[i] > 0) {
                maxSum += isEvenIdx ? (i - k) : 0;
                countArr[i]--;
                isEvenIdx = !isEvenIdx;
            }
        }
        return maxSum;   
    }
}