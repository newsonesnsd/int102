import java.util.Scanner;
public class Homework3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Product 1
        System.out.print("Product 1 : ");
        int getFirstPrice = input.nextInt();
        // Product 2
        System.out.print("Product 2 : ");
        int getSecondPrice = input.nextInt();
        // Product 3
        System.out.print("Product 3 : ");
        int getThirdPrice = input.nextInt();
        // Find minimum price
        int minPrice = Math.min(Math.min(getFirstPrice, getSecondPrice), getThirdPrice);
        System.out.print("Choose : " + minPrice);
    }
}
