import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String str = reader.next();
        char[] word = str.toCharArray();
        int sizeArray = word.length;
        char[] orginalWord = Arrays.copyOf(word, word.length);

        for (int i = 0; i < sizeArray / 2; i++) {
            char temp = word[i];
            word[i] = word[sizeArray - i - 1];
            word[sizeArray - i - 1] = temp;
        }
        if (Arrays.equals(word, orginalWord)) {
            System.out.println("Entered word is a palindrome!");
        } else {
            System.out.println("Entered word isn't palindrome!");
        }
    }
}
