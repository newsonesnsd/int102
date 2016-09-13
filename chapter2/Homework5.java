/**
 *
 * @author Jirapong Rungsawang
 * 59130500011
 */
public class Homework5 {
	public static void main(String[] args) {
		int x= 1;
		int y= 89;
		int z= 93;
		x = y;
		z = x;
		System.out.println("X = " + x); // Output is 89 from x = y
		System.out.println("Y = " + y); // Output is 89 from int y = 89
		System.out.println("Z = " + z); // Output is 89 frin z = x (and x = 89 from x = y)
	}

}
