import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How many elements do you want in your first array?");
        int numberElements = reader.nextInt();
        int[] firstArray = new int[numberElements];
        System.out.println("Please enter " + numberElements + " integer elements: ");
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = reader.nextInt();
        }
        System.out.println("How many elements do you want in your second array?");
        int numberElementsSecond = reader.nextInt();
        int[] secondArray = new int[numberElementsSecond];
        System.out.println("Please enter " + numberElementsSecond + " integer elements: ");
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = reader.nextInt();
        }
        int[] concatenation = new int[firstArray.length + secondArray.length];
        int k = 0;
        System.out.println("First array: " + Arrays.toString(firstArray));
        System.out.println("Second array: " + Arrays.toString(secondArray));
        for (int element : firstArray) {
            concatenation[k] = element;
            k++;
        }
        for (int element : secondArray) {
            concatenation[k] = element;
            k++;
        }
        //Ispis bez posljednjeg zareza
        System.out.println("Concatenation array: ");
        if (concatenation.length >= 1) {
            System.out.print(concatenation[0]);
        }
        for (int i = 1; i < concatenation.length; i++) {
            System.out.print(", " + concatenation[i]);
        }
    }
}
