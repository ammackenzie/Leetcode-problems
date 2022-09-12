package medium.bagOfTokens;

import java.util.Arrays;

public class Solution {
        public int bagOfTokensScore(int[] tokens, int power) {
            Arrays.sort(tokens);
            int i=0, score = 0, j = tokens.length-1;
            while(i <= j){
                if(power >= tokens[i]){
                    power -= tokens[i++];
                    score++;
                }else if(score >0 && i < j){
                    power += tokens[j--];
                    score--;
                }else{
                    break;
                }
            }
            return score;
        }
}
