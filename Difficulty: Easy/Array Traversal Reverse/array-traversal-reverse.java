class Solution {
    public static void arrayTraversalReverse(int[] arr, int n) {
        // Code here
        int l = 0;
        int r = n-1;
        
        while(l<=r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
           for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
           }
    }
}
