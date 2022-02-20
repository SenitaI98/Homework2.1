import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How many elements do you want in your array:");
        int numberOfElements = reader.nextInt();
        String[] array = new String[numberOfElements+1];
        System.out.println("Please enter " + numberOfElements + " strings");
        for (int i = 0; i<array.length; i++) {
            array[i] = reader.nextLine();
        }
        System.out.println("Elements which have vowels are: ");
        for (int i = 0; i<array.length; i++) {
            if(array[i].toLowerCase().contains("a") || array[i].toLowerCase().contains("e") || array[i].toLowerCase().contains("i") || array[i].toLowerCase().contains("o") || array[i].toLowerCase().contains("u")){
                System.out.print(array[i] + " ");
            }
        }
    }
}
