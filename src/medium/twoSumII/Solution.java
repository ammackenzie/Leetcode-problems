package medium.twoSumII;

public class Solution {
    public int[] twoSumBruteForce(int[] numbers, int target) {
        int[] output = new int[2];
        for(int index=0; index< numbers.length; index++){
            for(int innerIndex=index+1; innerIndex < numbers.length; innerIndex++){
                if(numbers[index] + numbers[innerIndex] == target){
                    output[0] = index+1;
                    output[1] = innerIndex+1;
                }
            }
        }
        return output;
    }

    public int[] twoSumBinarySearch(int[] numbers, int target){
        for (int i = 0; i < numbers.length; i++) {
            int low = i + 1;
            int high = numbers.length - 1;
            while (low <= high) {
                int mid = (high - low) / 2 + low;
                if (numbers[mid] == target - numbers[i]) {
                    return new int[]{i + 1, mid + 1};
                } else if (numbers[mid] > target - numbers[i]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static int[] twoSumTwoPointers(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        while(left < right){
            if(numbers[left] + numbers[right] == target){
                return new int[]{left+1, right +1};
            }
            if(numbers[left] + numbers[right] < target){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{};
    }
}
