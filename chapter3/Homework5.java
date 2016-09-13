import java.util.Scanner;
import java.lang.StringBuffer;

public class Homework5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter : ");
        String textInput = input.next();
        int textLength = textInput.length();
        if (textLength == 6) {
            String textReverse = new StringBuffer(textInput).reverse().toString();
            System.out.println("Reverse : \"" + textReverse + "\"");
        }
        else {
            System.out.println("Please enter text only 6 char");
        }
    }
}
