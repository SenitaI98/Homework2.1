import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How many elements do you want in the first array?");
        int numberLengthFirst = reader.nextInt();
        int[] firstArray = new int[numberLengthFirst];
        int k = 0;
        for (int i = 0; i < firstArray.length; i++) {
            System.out.println("Please enter integer element number " + ++k);
            firstArray[i] = reader.nextInt();
        }
        System.out.println("How many elements do you want in the second array?");
        int numberLengthSecond = reader.nextInt();
        int[] secondArray = new int[numberLengthSecond];
        int j = 0;
        for (int i = 0; i < secondArray.length; i++) {
            System.out.println("Please enter integer element number " + ++j);
            secondArray[i] = reader.nextInt();
        }
        System.out.println("First array: " + Arrays.toString(firstArray));
        System.out.println("Second array: " + Arrays.toString(secondArray));
        k = 0;
        if (firstArray.length >= secondArray.length) {
            for (int i = 0; i < firstArray.length; i++) {
                if (k < secondArray.length) {
                    System.out.print((firstArray[i] + secondArray[k]) + " ");
                } else if (k >= secondArray.length) {
                    System.out.print(firstArray[i] + " ");
                }
                k++;
            }
        } else if (firstArray.length < secondArray.length) {
            for (int i = 0; i < secondArray.length; i++) {
                if (k < firstArray.length) {
                    System.out.print((secondArray[i] + firstArray[k]) + " ");
                } else if (k >= firstArray.length) {
                    System.out.print(secondArray[i] + " ");
                }
                k++;
            }
        }
    }
}
