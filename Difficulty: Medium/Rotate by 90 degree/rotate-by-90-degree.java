class Solution {
    public void rotateMatrix(int[][] mat) {
        // code here
        int n = mat.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        //for anticlockwise reverse columns
        for(int col=0; col<n; col++){
            int start = 0;
            int end = n-1;
            
            while(start<end){
                int temp = mat[start][col];
                mat[start][col] = mat[end][col];
                mat[end][col] = temp;
                
                start++;
                end--;
            }
        }
    }
}