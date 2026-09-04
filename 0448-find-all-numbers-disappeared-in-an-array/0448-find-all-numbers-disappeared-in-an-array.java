class Solution {
    // public List<Integer> findDisappearedNumbers(int[] nums) {
    //     List<Integer> res = new ArrayList<>();
    //     for(int i=0; i<nums.length; i++) {
    //         int idx = Math.abs(nums[i]) - 1;
    //         if(nums[idx] < 0) {
    //             continue;
    //         }
    //         else {
    //             nums[idx] = - nums[idx];
    //         }
    //     }
    //     for(int i=0; i<nums.length; i++) {
    //         if(nums[i] > 0) {
    //             res.add(i+1);
    //         }
    //     }
    //     return res;
    // }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> s = new HashSet<>();
        List<Integer> res = new ArrayList<>();

        for(int i=0; i<nums.length; i++) {
            s.add(nums[i]);
        }
        for(int i=1; i<=nums.length; i++) {
            if(!s.contains(i)) {
                res.add(i);
            }
        }
        return res;
    }

}