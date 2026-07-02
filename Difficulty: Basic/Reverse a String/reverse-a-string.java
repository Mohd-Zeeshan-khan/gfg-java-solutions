class Solution {
    public static String reverseString(String s) {
        // code here
        String reverse = "  ";
        int n = s.length();
        
        for(int i=n-1;i>=0; i--){
            char ch = s.charAt(i);
            reverse+=ch;
        }
        return reverse;
    }
}