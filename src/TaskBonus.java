import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskBonus {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a first number in a range: ");
        int firstNumber = reader.nextInt();
        System.out.println("Enter a last number in a range:");
        int lastNumber = reader.nextInt();
        List<Integer> otherNumbers = new ArrayList<Integer>(); //Jedan mali cheating, cisto iz znatizelje pokusala listu iskoristiti

        for (int i = firstNumber; i < lastNumber + 1; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                otherNumbers.add(i);
                String f = String.valueOf(i);
                f = "Fizz";
                System.out.println(f);
            } else if (i % 5 == 0 && i % 3 != 0) {
                otherNumbers.add(i);
                String b = String.valueOf(i);
                b = "Buzz";
                System.out.println(b);
            } else if (i % 3 == 0 && i % 5 == 0) {
                otherNumbers.add(i);
                String fb = String.valueOf(i);
                fb = "FizzBuzz";
                System.out.println(fb);
            } else {
                String s = String.valueOf(i);
                System.out.println(s);
            }
        }
        System.out.println("Numbers Fizz, Buzz or FizzBuzz are: " + otherNumbers);
    }
}
