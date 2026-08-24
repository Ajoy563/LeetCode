class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int num : nums1){
            set1.add(num);
        }
        for(int num : nums2){
            set2.add(num);
        }

        int n = Math.min(set1.size(), set2.size());
        int res[] = new int[n];

        int k = 0;
        for(int  num : set1) {
            if(set2.contains(num)) {
                res[k] = num;
                k++;
            }
        }

        return Arrays.copyOfRange(res, 0, k);
    }
}