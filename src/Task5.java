import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter lower number in range:");
        int low = reader.nextInt();
        System.out.println("Please enter larger number in range:");
        int larg = reader.nextInt();
        System.out.println("Even numbers for range " + low + " to " + larg + " are:");
        for (int i = low + 1; i < larg; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
