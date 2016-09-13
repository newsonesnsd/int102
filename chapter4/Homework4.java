import java.util.Scanner;

public class Homework4 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String productStock = "";
            System.out.print("Enter product name : ");
            String getName = input.nextLine();
            System.out.print("Enter product type : ");
            String getType = input.nextLine();
            getType = getType.toLowerCase();
            int firstChar = (int) Character.toLowerCase(getName.charAt(0));
            if (firstChar >= 97 && firstChar <= 122) {
                productStock = "AP";
                if (getType.equals("toy")) {
                        productStock = productStock + "TOY11";
                }
                else if (getType.equals("accessory")) {
                    productStock = productStock + "ACC12";
                }
                else {
                    productStock = productStock + "BAG13";
                }
            }
            else {
                productStock = "QZ";
                if (getType.equals("toy")) {
                        productStock = productStock + "TOY18";
                }
                else if (getType.equals("accessory")) {
                    productStock = productStock + "ACC19";
                }
                else {
                    productStock = productStock + "BAG20";
                }
            }
            System.out.println("Stock to : " + productStock);
        }
}
