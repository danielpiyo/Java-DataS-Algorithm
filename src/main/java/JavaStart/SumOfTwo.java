package JavaStart;

import java.util.ArrayList;
import java.util.List;

public class SumOfTwo {
    public static void main(String[] args) {

        int[] myArray = new int[]{2,4,5,6,7,8,9};
        int x = 6;

        twoSum(myArray,x);

        oddNumbers(3,20);

    }

    public static int[] twoSum(int[] nums, int target) {

        for (int i=0; i<nums.length; i++){
            for (int j=i+1; j< nums.length; j++){
                if (nums[i] + nums[j] == target){
                    return new int []{i,j};
                }
            }
        }
        return nums;
    }

    public static String findNumber(List<Integer> arr, int k) {
        // Write your code here
        for (int i = 0; i < arr.size(); i++) {
            int startIndex = 0;
            if (arr.contains(k)) {
                return new String("Yes");
            } else return new String("No");

        }
        return String.valueOf(arr);
    }

    public static List<Integer> oddNumbers(int l, int r) {
        boolean isOdd = true;
        List<Integer> result = new ArrayList<>();
        // Write your code here
        for(int i= l; i<= r; i++ ){
            if(i%2 == 0){
                isOdd = false;
                break;
            } else {
                return  result;
            }
        }

        return result;
    }


}
