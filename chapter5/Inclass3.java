import java.util.Scanner;

public class Inclass3 {
	public static void main(String[] args) {
		//Scanner input = new Scanner(System.in);
		int randomNum = (int) (Math.random()*9-0+1);
		do {
			System.out.println(randomNum);
			randomNum = (int) (Math.random()*9-0+1);
		}while(randomNum != 5);
	}
}