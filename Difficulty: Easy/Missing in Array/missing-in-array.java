class Solution {
    int missingNum(int arr[]) {
        // code here
        int xorSum = 0;
        for (int n : arr){
            xorSum = xorSum^n;
        }
        int n = arr.length;
        for(int i=0; i<=n+1;i++){
            xorSum= xorSum ^ i;
            
        }
        return xorSum;
    }
}