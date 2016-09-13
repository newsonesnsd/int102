import java.util.*;
import java.text.*;
public class Credit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Subject 1 : ");
		String sj1 = sc.next();
		System.out.print("Credits Subject 1 : ");
		int cd1 = sc.nextInt();
		
		System.out.print("Subject 2 : ");
		String sj2 = sc.next();
		System.out.print("Credits Subject 2 : ");
		int cd2 = sc.nextInt();
		
		
		System.out.print("Subject 3 : ");
		String sj3 = sc.next();
		System.out.print("Credits Subject 3 : ");
		int cd3 = sc.nextInt();
		
		int sum = (cd1+cd2+cd3)*1000;
		NumberFormat fm = NumberFormat.getCurrencyInstance();
		
		System.out.println("sum = "+fm.format(sum));
		
	}
}