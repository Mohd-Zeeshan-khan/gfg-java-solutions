class Solution {
    public int sumOfMatrix(int[][] arr) {
        // code here
        int m = arr.length;
        int n = arr[0].length;
        int sum = 0;
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n;j++){
                int value = arr[i][j];
                sum = sum + value;
            }
            
        }
      return sum;
    }
   
}