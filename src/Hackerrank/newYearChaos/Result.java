package Hackerrank.newYearChaos;

import java.util.List;

public class Result {

    /*
     * Complete the 'minimumBribes' function below.
     *
     * The function accepts INTEGER_ARRAY q as parameter.
     */

    public static void minimumBribes(List<Integer> q) {
        int bribes = 0;
        for(int i = q.size()-1; i>= 0; i--){
            int current = q.get(i);
            if(current-(i+1) > 2){
                System.out.println("Too chaotic");
                return;
            }else{
                for(int j = Math.max(0, current-2); j < i; j++){
                    if (q.get(j)> current){
                        bribes++;
                    }
                }
            }
        }

        System.out.println(bribes);
    }

}