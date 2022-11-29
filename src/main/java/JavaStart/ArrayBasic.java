package JavaStart;

public class ArrayBasic {
    public static void main(String[] args) {

        int myArray[];

        myArray = new int[5];
        myArray[0] = 10;
        myArray[1] = 20;
        myArray[2] = 30;
        myArray[3] = 40;
        myArray[4] = 50;

        for (int i=0; i < myArray.length; i++){
            System.out.println("The Array Elements" + i + ":" + myArray[i]);
        }
        
    }
}
