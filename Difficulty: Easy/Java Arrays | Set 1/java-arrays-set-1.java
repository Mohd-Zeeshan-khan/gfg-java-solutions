class Solution {
    public String average(int arr[]) {
        int result =0;
        for(int i=0;i<arr.length;i++){
            result+=arr[i];
        }
        double x=(double)result/arr.length;
        return String.format("%.2f",x);
    }
}