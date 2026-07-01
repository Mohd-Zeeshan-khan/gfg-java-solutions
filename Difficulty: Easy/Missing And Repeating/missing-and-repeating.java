class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int duplicate = -1;
        int missing = -1;
        //find duplicate
        for(int  i=0; i<arr.length; i++){
            int index = Math.abs(arr[i])-1;
            if(arr[index]<0){
                duplicate = Math.abs(arr[i]);
            }else{
                arr[index] = -arr[index];
            }
        }
        //find missing
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                missing = i+1;
                break;
            }
        }
        ans.add(duplicate);
        ans.add(missing);
        return ans;
    }
}