import java.util.*;
import java.text.*;
public class Homework1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long lotteryNum = (int) (Math.random() * 10000000000L);

        System.out.print("Enter lottery : ");
        long getNum = input.nextLong();
        while (getNum != 0 ) {
            if (getNum == lotteryNum) {
                System.out.println("1 st");
            }
            else if (getNum == lotteryNum % 100) {
                System.out.println("last 2 num");
            }
            else if (getNum == lotteryNum % 1000) {
                System.out.println("last 3 num");
            }
            else {
                System.out.println("no reward");
            }
            System.out.print("Enter lottery : ");
            getNum = input.nextLong();
        }
        System.out.println("Good Bye");
    }
}
