class Solution {
    static int inSequence(int a, int b, int c) {
        int n = ((b - a)/c)+1;

        int term = a + (n - 1)*c;

        if(b == term){
            return 1;
        }

        return 0;
    }
}