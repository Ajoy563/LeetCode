class Solution {
    // public void duplicateZeros(int[] arr) {
    //     int n = arr.length - 1, cntZero = 0;
    //     for (int i = 0; i <= n - cntZero; i++) {
    //         if (arr[i] == 0) {
    //             if (i == n - cntZero) {
    //                 arr[n] = 0;
    //                 n--;
    //                 break;
    //             }
    //             cntZero++;
    //         }
    //     }
    //     int lastIdx = n - cntZero;
    //     for (int i = lastIdx; i >= 0; i--) {
    //         if(arr[i] == 0) {
    //             arr[i + cntZero] = 0;
    //             cntZero--;
    //             arr[i + cntZero] = 0;
    //         }
    //         else {
    //             arr[i + cntZero] = arr[i];
    //         }
    //     }
    // }

    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int[] res= Arrays.copyOf(arr, n);
        int i=0;
        int j=0;
        while(i<n && j<n){
            arr[j] = res[i];
            j++;
            if (res[i] == 0 && j < n) {
                arr[j] = 0;
                j++;
            }
            i++;
        }
        return;
    }
}