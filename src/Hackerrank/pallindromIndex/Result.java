package Hackerrank.pallindromIndex;

public class Result {

    /*
     * Complete the 'palindromeIndex' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */


    public static int palindromeIndex(String s) {
        StringBuilder front = new StringBuilder(s);
        StringBuilder reverse = new StringBuilder(s).reverse();
        if(s.equals(reverse.toString()))return-1;
        for(int i=0; i< s.length();i++){
            if(front.charAt(i)!=reverse.charAt(i)){
                //worth removing to check
                if(isPalindrome(front.deleteCharAt(i))){
                    return i;
                }else if(isPalindrome(reverse.deleteCharAt(i))){
                    return s.length() - 1 - i;
                }
            }

        }
        return -1;
    }

    public static boolean isPalindrome(StringBuilder sb){
        StringBuilder r = new StringBuilder(sb).reverse();
        return r.toString().equals(sb.toString());
    }
}