import java.util.*;

public class Homework2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Word : ");
        String getWord = input.nextLine();
        String vowels = "aeiou";
        if (vowels.indexOf(Character.toLowerCase(getWord.charAt(0))) != -1) {
            System.out.println("an " + getWord);
        }
        else {
            System.out.println("a " + getWord);
        }
    }
}
