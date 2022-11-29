package JavaStart;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumberUserInput {
    public static void main(String[] args) {

        //        prime number is a number that is greater than 1 and has two factors 1 and itself

//        create a list to hold the prime numbers
        List<Integer> primeNumbers = new ArrayList<>();
//        prompt user to input the limit/max number
        System.out.println("Please input the Limit/ Max number");

//        using scanner to capture user inputs
        Scanner scanner = new Scanner(System.in);
        int user_limit = scanner.nextInt();

//        Identifying numbers to check between 1 and 100
        for (int numToCheck= 2; numToCheck<=user_limit; numToCheck++){
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
        System.out.println("Prime Numbers between 1 and " + user_limit + " :");
//        looping through the list so that to print the number
        for(int number: primeNumbers){
            System.out.print(number + " ");

        }
        System.out.println();
        System.out.println("Thank you for checki on this : Daniel Opiyo");
    }

    }

