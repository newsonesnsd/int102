import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long randomLotteryNum;
        String lotteryNum = "";
        int i = 1;
        while (i<=10) {
            randomLotteryNum = (int) (Math.random() * 10);
            lotteryNum += randomLotteryNum;
            i++;
        }
        randomLotteryNum = Long.parseLong(lotteryNum);
        System.out.println(lotteryNum + " is reward (show only in result)");
        System.out.print("Enter lottery : ");
        long getNum = input.nextLong();
        int checkDigit = String.valueOf(getNum).length();
        while (getNum != 0) {
            if (checkDigit == 10) {
                if (getNum == randomLotteryNum) {
                    System.out.println("Reward all digits!");
                }
                else if ((getNum % 1000) == (randomLotteryNum % 1000)) {
                    System.out.println("Reward the last 3 digits");
                }
                else if ((getNum % 100) == (randomLotteryNum % 100)) {
                    System.out.println("Reward the last 2 digits");
                }
                else {
                    System.out.println("No Reward");
                }
            }
            else {
                System.out.println("Please enter only 10 digits");
            }
            System.out.print("Enter lottery : ");
            getNum = input.nextLong();
        }
        System.out.println("End Program");
    }
}
