package JavaStart;

import java.util.Random;

public class QuickSortAlgorithm {
    public static void main(String[] args) {
//        Random numbers generation
        Random rand = new Random();
        int [] inputArray = new int[10];

//        populating the Array list
        for (int i=0; i<inputArray.length; i++){
            inputArray[i] = rand.nextInt(1000);
        }

//        printing before sort
        System.out.println("\nBefore sort");
        printArray(inputArray);

//        quick sort function
        quickSort(inputArray, 0, inputArray.length -1);

//        Printing After
        System.out.println("\nAfter sort");
        printArray(inputArray);
    }

    private static void quickSort(int[] inputArray, int lowIndex, int highIndex) {

        if (lowIndex >= highIndex){
            return;
        }
//        picking the pivot
        int pivot = inputArray[highIndex];
//        creating pointer to low and high index
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

//
        while (leftPointer < rightPointer){
            while (inputArray[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }
            while (inputArray[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }
//            sort function
            swap(inputArray, leftPointer, rightPointer);
        }
        swap(inputArray, leftPointer, highIndex);
//        do recursion for the left
        quickSort(inputArray, lowIndex, leftPointer-1);
//        do recursion for right
        quickSort(inputArray, leftPointer +1, highIndex);
    }

    private static void swap(int[] inputArray, int index1, int index2) {
        int temp = inputArray[index1];
        inputArray[index1] = inputArray[index2];
        inputArray[index2] = temp;
    }

    private static void printArray(int[] inputArray) {
        for (int i=0; i<inputArray.length; i++){
            System.out.print(inputArray[i] + ", ");
        }
    }
}
