import java.util.Scanner;

public class Homework3 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter : ");
            String getWord = input.nextLine();
            String wordSwapcase = "";
            for (int i = 0; i < getWord.length(); i++) {
                char c = getWord.charAt(i);
                boolean checkCase = Character.isUpperCase(c);
                if (checkCase == true) {
                    wordSwapcase = wordSwapcase + Character.toLowerCase(c);
                }
                else {
                    wordSwapcase = wordSwapcase + Character.toUpperCase(c);
                }
            }
            String wordReverse = new StringBuffer(wordSwapcase).reverse().toString();
            System.out.println("Reversed : \"" + wordReverse + "\"");
        }
}
