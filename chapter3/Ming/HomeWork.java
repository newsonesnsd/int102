import java.text.DecimalFormat;
import java.util.Scanner;
public class HomeWork{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("กรอกคะแนนเก็บจริง : ");
		int real = sc.nextInt();
		System.out.print("กรอกคะแนนเต็มข้อสอบ : ");
		int max = sc.nextInt();
		System.out.print("กรอกคะแนนที่ทำได้ในข้อสอบ : ");
		int scorce = sc.nextInt();
		
		double total = (double)(real*scorce)/max;
		DecimalFormat fm = new DecimalFormat("0.##");
		System.out.println("เทียบจากคะแนนเก็บจริงได้"+fm.format(total)+"/5");
	}
}