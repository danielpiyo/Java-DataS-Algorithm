package JavaStart;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    public static void main(String[] args) {
//        prime number is a number that is greater than 1 and has two factors 1 and itself

//        create a list to hold the prime numbers
        List<Integer> primeNumbers = new ArrayList<>();

//        Identifying numbers to check between 1 and 100
        for (int numToCheck= 2; numToCheck<=100; numToCheck++){
            boolean isPrime =true;
//            finding factors. Working with the lower half of numToCheck because by default the upper half will be divisible by 2
            for (int factor=2; factor<= numToCheck/2; factor++){
//                checking if its even using modulo % then we do not add it to the list
                if(numToCheck % factor == 0){
//                    will be true for even numbers
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
//                Add the numbers to the list
                primeNumbers.add(numToCheck);
            }

        }
        System.out.println("Prime Numbers between 1 and 100 : ");

//        looping through the list so that to print the number
        for(int number: primeNumbers){
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println("Thank you for checking on this : Daniel Opiyo");
    }
}
