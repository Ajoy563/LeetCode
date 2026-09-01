class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length - 1;
        int maxRight = Integer.MIN_VALUE;
        for(int i=n; i>=0; i--) {
            int temp = arr[i];
            if(i == n) {
                arr[i] = -1;
            }
            else {
                arr[i] = maxRight;
            }
            maxRight = Math.max(maxRight, temp);
        }
        return arr;
    }
}