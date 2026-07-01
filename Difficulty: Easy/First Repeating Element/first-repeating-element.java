class Solution {
    public static int firstRepeated(int[] arr) {
        HashMap<Integer , Integer> freq = new HashMap<>();
        
        for(int a : arr){
            freq.put(a, freq.getOrDefault(a,0)+1);
        }
        for(int i=0; i<arr.length;i++){
            if(freq.get(arr[i])>1){
                return i+1;
                
            }
        }
        return -1;
        
    }
}
