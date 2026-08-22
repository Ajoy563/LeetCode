class Solution {
    public int removeDuplicates(int[] nums) {
        // int k = 1;
        // for(int i=1; i<nums.length; i++) {
        //     if(nums[i] != nums[i-1]) {
        //         nums[k] = nums[i];
        //         k++;
        //     }
        // }
        // return k;
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int i=0; i<nums.length; i++) {
            set.add(nums[i]);
        }
        int k = set.size();
        int i=0;
        for(int x : set) {
            nums[i] = x;
            i++;
        }
        return k;
    }
}