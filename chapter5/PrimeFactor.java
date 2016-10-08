import java.util.Scanner;
public class PrimeFactor {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number ");   //
        int getNum = input.nextInt();
        System.out.println("Given number is : " + getNum);
        System.out.print("Prime Factors are : " );
        System.out.print("1");
        for (int i = 2; i <= getNum; i++) {
            while (getNum % i == 0) {
                System.out.print(" x " + i);
                getNum = getNum / i;
            }
        }
        if (getNum < 1) System.out.println(getNum);
    }
}
