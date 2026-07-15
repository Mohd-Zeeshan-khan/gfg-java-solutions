class Solution {
    public int findMin(int a, int b) {
        // code here
         int c=a+b;
        int res=0;
        try{
            
            int d=a-b;
            int e=a*b;
            int f=a/b; 
            
            if(c<=d && c<=e && c<=f) {
                res+=c;
            } else if(d<=e && d<=f) {
                res+=d;
            } else if(e<=f) {
                res+=e;
            } else {
                res+=f;
            }
            
        } catch(ArithmeticException e) {
            return res;
        }
        return res;
    }
}