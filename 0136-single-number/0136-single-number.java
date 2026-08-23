class Solution {
    // public int singleNumber(int[] nums) {
    //     HashMap<Integer, Integer> map = new HashMap<>();
    //     for(int n : nums) {
    //         map.put(n, map.getOrDefault(n, 0) + 1);
    //     }
    //     for(int n : nums) {
    //         if(map.get(n) == 1) {
    //             return n;
    //         }
    //     }
    //     return -1;
    // }

    public int singleNumber(int[] nums) {
        int xor = 0;
        for(int n : nums) {
            xor ^= n;
        }
        return xor;
    }
}