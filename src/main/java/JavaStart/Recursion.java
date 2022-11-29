package JavaStart;

public class Recursion {

    public static void main(String[] args) {
        greetings(6);
    }

    private static void greetings(int c) {
        System.out.println("Hello There");

        if (c<=1){
            return;
        }
        greetings(c-1);

    }
}


