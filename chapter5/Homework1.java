import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int randomLotteryNum = (int) (Math.random() * 10);
        String lotteryNum = "";
        int i = 1;
        while (i<=10) {
            randomLotteryNum = (int) (Math.random() * 10);
            lotteryNum += randomLotteryNum;
            i++;
        }
        int numLength = lotteryNum.length();
        System.out.println(lotteryNum + " is reward");
        // reward
        String allDigit = lotteryNum;
        String lastTwoDigit = lotteryNum.substring(numLength-2);
        String lastThreeDigit = lotteryNum.substring(numLength-3);
        System.out.print("Enter lottery : ");
        String getNum = input.nextLine();
        // Check input
        String getTwoDigit = getNum.substring(numLength-2);
        String getThreeDigit = getNum.substring(numLength-3);
        while (getNum.equals("0") == false) {
            if (getNum.equals(allDigit)) {
                System.out.println("all digits!");
            }
            else if (getNum.substring(numLength-2).equals(lastTwoDigit)) {
                System.out.println("last 2 num");
            }
            else if (getNum.substring(numLength-3).equals(lastThreeDigit)) {
                System.out.println("last 3 num");
            }
            else {
                System.out.println("no reward");
            }
            System.out.print("Enter lottery : ");
            getNum = input.nextLine();
        }
        System.out.println("Good Bye");
    }
}
