class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        //Transpose
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<m; j++) {
                if(i != j) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }

        //reverse the col
        int s = 0;
        int e = m-1;
        while(s < e) {
            for(int i=0; i<n; i++) {
                int temp = matrix[i][s];
                matrix[i][s] = matrix[i][e];
                matrix[i][e] = temp;
            }
            s++;
            e--;
        }
        return;
    }
}