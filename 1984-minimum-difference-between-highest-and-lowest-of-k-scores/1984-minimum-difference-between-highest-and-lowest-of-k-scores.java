class Solution {
    public int minimumDifference(int[] nums, int k) {
        int minScore = Integer.MAX_VALUE;
        Arrays.sort(nums);

        for(int i=0; i+k-1 < nums.length; i++) {
            int curr = nums[i+k-1] - nums[i];

            minScore = Math.min(minScore, curr);
        }
        return minScore;
    }
}