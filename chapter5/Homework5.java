import java.util.Scanner;

public class Homework5 {
	public static void main(String[] args) {
		int liftFloor =1;
		int liftGo = 0;
		Scanner input = new Scanner (System.in);
		while (true) {
			System.out.print("Enter Floor ");
			liftGo = input.nextInt();
			if(liftGo>=1 && liftGo<=5) {
				System.out.print("Elevator ");
				if (liftFloor <= liftGo) {
					while(liftFloor <= liftGo) {
						System.out.print(liftFloor + ".. ");
						++liftFloor;
					}
					System.out.println("");
					System.out.println("Now " + liftFloor + " Floor");
				}
				else {
					while(liftFloor > liftGo) {
						System.out.print(liftFloor + ".. ");
						liftFloor--;
					}
					System.out.print(liftFloor + ".. ");
					System.out.println("");
					System.out.println("Now " + liftFloor + " Floor");
				}
			}
			else {
				System.out.println("Wrong Floor");
			}
		}
	}
}
