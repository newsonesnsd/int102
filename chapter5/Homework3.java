import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Num : ");
        int getNum = input.nextInt();
        //System.out.println("Given number is : " + getNum);
        if (getNum>=1) {
            System.out.print("Prime Factors are : " );
            System.out.print("1");
            for (int i = 2; i <= getNum; i++) {
                while (getNum % i == 0) {
                    System.out.print(" x " + i);
                    getNum = getNum / i;
                }
            }
        }
        else {
			System.out.println("Please enter number more than 1");
        }
    }
}
