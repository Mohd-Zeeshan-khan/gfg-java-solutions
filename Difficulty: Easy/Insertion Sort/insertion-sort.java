class Solution {
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        // code here
        int n = arr.length;
        for(int i=0; i<n; i++){
            int curr = i;
            int prev = i-1;
            int currValue = arr[i];
            
            while(prev>=0 && currValue<arr[prev]){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = currValue;
        }
    }
}