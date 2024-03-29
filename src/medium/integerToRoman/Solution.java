package medium.integerToRoman;

class Solution {
    public String intToRoman(int num) {
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] strs = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        int i=0;
        String result = "";
        while(num >0){
            while(num >= values[i]){
                result += strs[i];
                num -= values[i];
            }
            i++;
        }
        return result;
    }
}
