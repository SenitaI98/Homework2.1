import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How many elements do you want in your array?");
        int numberLength = reader.nextInt();
        int[] myArray = new int[numberLength];
        int k = 0;
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Please enter integer element number " + ++k);
            myArray[i] = reader.nextInt();
        }
        System.out.println("The entered numbers are:");
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                if (myArray[i] > 10) {
                    System.out.println(myArray[i] + " - divisible by 2 and greater then 10");
                } else if (myArray[i] < 10) {
                    System.out.println(myArray[i] + " - divisible by 2 and less then 10");
                }
            } else {
                if (myArray[i] > 10) {
                    System.out.println(myArray[i] + " - not divisible by 2 and greater then 10");
                } else if (myArray[i] < 10) {
                    System.out.println(myArray[i] + " - not divisible by 2 and less then 10");
                }
            }
        }
    }
}
