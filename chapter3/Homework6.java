import java.util.*;

public class Homework6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Username : ");
        String getUser = input.next();
        if (getUser.length() >= 6 ) {
			// Username Length
			int userLenght = getUser.length();
            // Username 
            String firstChar = getUser.substring(0,1).toUpperCase();
            String secondChar = getUser.substring(userLenght-2,userLenght-1).toLowerCase() + getUser.substring(userLenght-1).toLowerCase();
            // Random number
            Random rd = new Random();
            int num = rd.nextInt(201) - 100; // n2 = 100, n1=-100
            String password = firstChar + secondChar + num;
            System.out.println("Username : " + getUser);
            System.out.println("Password : " + password);
        }
        else {
            System.out.println("Please enter username at lease 6 Character");
        }

    }
}
