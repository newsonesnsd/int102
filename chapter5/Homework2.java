import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter : ");
        String getText = input.nextLine();
        int spaceCount = getText.length() - getText.replaceAll(" ", "").length();
        int wordCount = spaceCount + 1;
        System.out.println(wordCount + " words");
        String[] textInverse = getText.split(" ");
        for (int i = spaceCount; i >= 0; i--) {
            System.out.print(textInverse[i] + " ");
        }
    }
}
