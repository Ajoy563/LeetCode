class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length - 1;
        int maxRight = -1;
        for(int i=n; i>=0; i--) {
            int temp = arr[i];
            arr[i] = maxRight;
            maxRight = Math.max(maxRight, temp);
        }
        return arr;
    }
}