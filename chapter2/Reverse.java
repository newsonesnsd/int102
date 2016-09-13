import java.util.Scanner;
import java.lang.StringBuffer;
public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number ");
        int numInput = input.nextInt();
        // reverse function >> Math method
        int firstDigit = numInput % 10;
        numInput = (numInput - firstDigit) / 10;
        int secondDigit = numInput %10;
        numInput = (numInput - secondDigit) / 10;
        int thirdDigit = numInput % 10;
        System.out.println("Reversed " + firstDigit + "" + secondDigit + "" + thirdDigit);
        // StringBuffer method
        System.out.print("Input number ");
        String textInput = input.next();
        String textReverse = new StringBuffer(textInput).reverse().toString();
        System.out.println(textReverse);
    }
}
