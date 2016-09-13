import java.util.Scanner;
public class Homework9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Change Km to Mile
        System.out.print("Input your distance in kilometer : ");
        double distance = input.nextDouble();
        // 1 mile = 0.62137 km
        double mileDistance = distance * 0.62137;
        System.out.println("Distance in mile is : " + mileDistance + " mile");
        // celsius to fahrenheit
        System.out.print("Input your degree celsius : ");
        double degreeCelsius = input.nextDouble();
        // 1 degree Celsius = 9 * c / 5 + 32
        double degreeFahrenheit = (degreeCelsius * 9 / 5) + 32;
        System.out.println(degreeCelsius + " Degree Celsius = " + degreeFahrenheit + " Degree Fahrenheit");
    }
}
