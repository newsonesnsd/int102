import java.text.DecimalFormat;
import java.util.Scanner;

class Homework4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		System.out.print("Enter real score : ");
		int realScore = input.nextInt();
		System.out.print("Enter max score : ");
		int maxScore = input.nextInt();
		System.out.print("Enter your exam score : ");
		double examScore = input.nextInt();
		double total = (realScore*examScore)/maxScore;
		DecimalFormat fm = new DecimalFormat("0.##");
		System.out.println("Your Score : "+fm.format(total)+"/5");
    }
}
