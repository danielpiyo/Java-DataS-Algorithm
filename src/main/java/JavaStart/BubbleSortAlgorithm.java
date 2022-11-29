package JavaStart;

import java.util.Random;

public class BubbleSortAlgorithm {
    public static void main(String[] args) {
//        declaring a variable rand for random numbers
        Random rand = new Random();
        int numberList[] = new  int[10];

//        populating my list with random numbers
        for (int i=0; i<numberList.length; i++){
            numberList[i] = rand.nextInt(1000);
        }
        boolean needSwap = true;

        while (needSwap) {
            needSwap = false;
            //        Bubble sort algorithm (It compares between the 1st element and the next, if the next element is greater than the 1st element it swaps)
            for (int i = 0; i < numberList.length - 1; i++) {
                if (numberList[i] > numberList[i +1]){
                    needSwap =true;
//                    temporary variable to hold our 1st element before swap
                    int temp = numberList[i];
                    numberList[i+1] = numberList[i];
                    numberList[i] = temp;
                }
            }
            System.out.println("\nList");
            printArrayList(numberList);
        }
    }
    private static void printArrayList(int[] list){
        for (int i=0; i<list.length; i++){
            System.out.println(list[i]);
        }
        System.out.println();
        System.out.println("Thank you for checking on this : Daniel Opiyo");
    }
}
