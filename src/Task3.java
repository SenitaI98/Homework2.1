import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How many elements do you want in your array?");
        int numberElements = reader.nextInt();
        int[] myArray = new int[numberElements];
        System.out.println("Please enter " + numberElements + " integer elements: ");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = reader.nextInt();
        }
        System.out.println("Orginal array:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println("\nReversed array:");
        for (int j = myArray.length - 1; j >= 0; j--) {
            System.out.print(myArray[j] + " ");
        }
    }
}
