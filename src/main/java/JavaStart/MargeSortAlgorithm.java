package JavaStart;

import java.util.Random;

public class MargeSortAlgorithm {
    public static void main(String[] args) {
//        generate random numbers
        Random rand = new Random();
        int [] inputArray = new int[10];

//        populating our array
        for(int i=0; i<inputArray.length; i++){
            inputArray[i] = rand.nextInt(100);
        }

//        print the array before sorting
        System.out.println("\nBefore Sort operation");
        printArray(inputArray);

//        marge-sorting operations. Dividing the whole list into two. the sorting each independent half(left and right)
        margeSort(inputArray);

//        print the array After sorting
        System.out.println("\nAfter Sort operation");
        printArray(inputArray);


    }

    private static void margeSort(int[] inputArray) {
        int inputSize = inputArray.length;   // getting the size of the whole array
        int midPointIndex = inputSize/2;     // getting the middle point to use in dividing the array into two
//        by default if the array has one element its already sorted
        if(inputSize <2){
            return;
        }
//        create arrays to hold the left half and the right half
        int [] leftHalf = new int[midPointIndex];
        int [] rightHalf = new int[inputSize - midPointIndex];

//        populating the left half with data
        for (int i=0; i< midPointIndex; i++){
            leftHalf[i] = inputArray[i];
        }
//        populating the right half with data. starting from the midpoint where it stopped previously
        for (int i=midPointIndex; i< inputSize; i++){
            rightHalf[i - midPointIndex] = inputArray[i];
        }

//        we need to perform these operations to ensure that all the list is divided to the least
//        we shall perform recursion
        margeSort(leftHalf);
        margeSort(rightHalf);
//        we need now to combine the already broken(leftHalf & rightHolf) elements into a new arraylist
        marge(inputArray, leftHalf, rightHalf);

    }

    private static void marge(int[] inputArray, int[] leftHalf, int[] rightHalf) {
//        getting the size of leftHalf and rightHalf
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
        int i = 0, j=0, k=0; // shall be used to iterate through leftHalf, rightHalf and the combining array respectively

//        situation where both i & J are less than their array length.
        while (i <leftSize && j <rightSize){
            if (leftHalf[i] < rightHalf[j]){
                inputArray[k] = leftHalf[i];
                i++;
            } else {
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }
//        when i < leftSize only
        while (i< leftSize){
            inputArray[k]= leftHalf[i];
            i++;
            k++;
        }
//        when j <rightSize
        while (j <rightSize){
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }

    }

    private static void printArray(int[] inputArray) {
        for (int i=0; i<inputArray.length; i++){
            System.out.print(inputArray[i] + ", ");
        }
    }
}
