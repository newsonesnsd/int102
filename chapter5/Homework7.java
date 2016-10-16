import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, getNum;
        int result =  1;
        System.out.println("Program to find Factorial");
        System.out.print("Enter number : ");
        getNum = input.nextInt();
        for (i = 1; i <= getNum ; i++) {
            result = result * i;
        }
        System.out.println("Factorial of " + getNum + " is " + result);
    }
}
