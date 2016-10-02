import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A.D. ");
        int year = input.nextInt();
        boolean isLeapyer = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (isLeapyer == true) {
            System.out.println(year + " is leap yaer");
        }
        else {
            System.out.println(year + " is not leap year");
        }
    }
}
