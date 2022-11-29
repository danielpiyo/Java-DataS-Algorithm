package JavaStart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InterviewPrep {
    public static void main(String[] args) {

        counting("011");

        List<Integer> myArray = new ArrayList<>();
        myArray.add(140537896);
        myArray.add(243908675);
        myArray.add(670291834);
        myArray.add(923018467);
        myArray.add(520718469);

//        int [] myArray = new int[]{140537896, 243908675, 670291834, 923018467, 520718469};
            miniMaxSum(myArray);
    }


//    plus minus
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        double positive= 0, negative=0, zero =0;
        int arraySize = arr.size();
        for(int i=0; i<arraySize; i++){
            if(arr.get(i)>0){
                positive++;
            } else if(arr.get(i) <0){
                negative++;
            } else {
                zero++;
            }
        }
        System.out.println(positive/arraySize);
        System.out.println(negative/arraySize);
        System.out.println(zero/arraySize);
    }



//    Mn Max sum values

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
//        sort the array
        Collections.sort(arr);
        long result = 0;
        int arrSize = arr.size();
        for(int i=0; i<arrSize; i++){
            result += arr.get(i);
        }
        // to get the max sum we shall take the sorted array (substruct the last element from the sum)
        long minSum = result - arr.get(arrSize -1);
        long maxSum = result - arr.get(0);

        System.out.println(minSum + " " + maxSum);
    }


    public static String compressedString(String message) {

        int maxLenght =0;
        int count = 1;

        StringBuilder toOutPut = new StringBuilder();
        char start = message.charAt(0);

        for(int i=0; i< message.length(); i++){
            if(message.charAt(i) == start){
                count++;
            }
            else{
                if(count > 1){
                    toOutPut.append(start + "" + count);
                }
                else{
                    toOutPut.append(start);
                }
                count = 1;
                start = message.charAt(i);
            }

        }
        if(count > 1){
            toOutPut.append(start + "" + count);
        } else {
            toOutPut.append(start);
        }
        return toOutPut.toString();

    }




    static int counting(String s) {

        int result =1;
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)>0){
                count++;
            } else {
                result = count;
            }
        }
        System.out.println(result);
        return result;


    }
}

