import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How many elements do you want in your array? (1-15)");
        int number = reader.nextInt();
        String[] ordinalNumber = {"First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh", "Eighth", "Ninth", "Tenth", "Eleventh", "Twelfth", "Thirteenth", "Fourteenth", "Fifteenth"};
        int[] myArray = new int[number];

        int k = 0;
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Please enter integer element number " + ++k);
            myArray[i] = reader.nextInt();
        }
        System.out.println("Elements in array: ");
        for (int j = 0; j < myArray.length; j++) {
            System.out.println(ordinalNumber[j] + " number in array: " + myArray[j]);
        }
    }
}
