import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
        int j = 2;
        int result = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = input.nextInt();
        while (j <= number / 2) {
            if (number % j == 0) {
               result = 1;
            }
            j++;
        }
        if (result == 1) {
            System.out.println("Number: " + number + " is Not Prime.");
        }
        else {
            System.out.println("Number: " + number + " is Prime. ");
        }
    }
}
