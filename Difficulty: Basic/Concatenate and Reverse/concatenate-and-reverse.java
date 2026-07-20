class Solution {  
    static String conRevstr(String s1, String s2) {
        String s3=s1+s2;
        StringBuilder s4=new StringBuilder(s3);
        s4.reverse();
        return s4.toString();
    }
}