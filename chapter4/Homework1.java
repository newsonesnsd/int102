import java.util.*;

public class Homework1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int getAge = input.nextInt();
        if (getAge >= 4 && getAge <= 6) {
            System.out.println("Kindergarten");
        }
        else if (getAge >= 7 && getAge <= 12) {
            System.out.println("Elementary education");
        }
        else if (getAge >= 13 && getAge <= 18) {
            System.out.println("High school");
        }
        else if (getAge >= 19 && getAge <= 22) {
            System.out.println("University");
        }
        else {
            System.out.println("Unknown");
        }
    }
}
