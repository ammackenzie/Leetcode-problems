package medium.stringToInteger;

public class Solution {
    public int myAtoi(String s) {
        int sign=1, i=0, base=0;
        if(s.isEmpty()) return 0;
        while(i < s.length() && s.charAt(i)==' '){i++;}
        if(i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')){
            if(s.charAt(i)=='-'){ sign =-1;}
            i++;
        }
        while(i < s.length() && s.charAt(i) >='0' && s.charAt(i)<='9'){
            if(base>Integer.MAX_VALUE/10||(base==Integer.MAX_VALUE/10&&(s.charAt(i)-'0'>Integer.MAX_VALUE%10))){
                return sign>0?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            base=base*10+(s.charAt(i++)-'0');
        }
        return base*sign;
    }
}
