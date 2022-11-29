package JavaStart;

public class Fibonacci {
    public static void main(String[] args) {
        int x = 10;

        fibonacci(x);
        for (int i=0; i<x; i++){
            System.out.print(fibonacci(i) + " ");
        }
    }

    private static long fibonacci(int n) {
//        creating base case
        if(n<=1){
            return n;
        }
        return (fibonacci(n-1) + fibonacci(n-2));
    }


}
