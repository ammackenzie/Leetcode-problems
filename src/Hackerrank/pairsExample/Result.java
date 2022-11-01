package Hackerrank.pairsExample;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'pairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY arr
     */


    public static int pairs(int k, List<Integer> arr) {
        // Write your code here
        int matches = 0;
        Collections.sort(arr);
        int l=0, r=1;
        while(r < arr.size()){
            int diff = arr.get(r) - arr.get(l);
            if(diff == k){
                matches++;
                r++;
            }else if(diff > k){
                l++;
            }else{
                r++;
            }
        }
        return matches;
    }
}

