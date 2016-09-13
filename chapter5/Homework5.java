import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int liftFloor = 1;
        System.out.print("Enter Floor : ");
        int getFloor = input.nextInt();
        do {
            System.out.print(liftFloor);
            liftFloor++;
        } while (getFloor<=liftFloor);
    }
}
