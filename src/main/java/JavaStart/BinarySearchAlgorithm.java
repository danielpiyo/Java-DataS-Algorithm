package JavaStart;

import java.util.Scanner;

public class BinarySearchAlgorithm {
    public static void main(String[] args) {

//        the ordered array
        int [] myArrayList = new int[6];
        myArrayList[0] = 2;
        myArrayList[1] =4;
        myArrayList[0] = 7;
        myArrayList[1] =8;
        myArrayList[0] = 10;
        myArrayList[1] =11;

        System.out.println("Please input the target: ");
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();

//        Calling the binarysearch
        binarySearch(myArrayList,target);
    }

    private static int binarySearch(int[] myArrayList, int target) {

        int leftIndex = 0;
        int rightIndex = myArrayList.length -1;
        int midPoint = leftIndex + (rightIndex-leftIndex)/2;
        if(myArrayList.length == 0){
            return -1;
        }
        while(leftIndex<rightIndex){
            if (myArrayList[midPoint] == target){
                return midPoint;
            }
            else if (myArrayList[midPoint] > target);{
                rightIndex = midPoint -1;

            }
            leftIndex = midPoint +1;
        }
        return  -1;
    }
}
