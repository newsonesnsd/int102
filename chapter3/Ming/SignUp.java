import java.util.*;
import java.io.*;
public class SignUp{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("USERNAME: ");
		String username = sc.next();
		int userlength = username.length();
		if(userlength>=6){
			String pass3 = username.substring(0,1);
			String pass2 = username.substring(1,3);
			Random rd = new Random();
			int num = rd.nextInt(201)+100;
		
		String up = pass3.toUpperCase();
		String low = pass2.toLowerCase();
		System.out.println("Username: "+username);
		System.out.println("Password: " + up + low + num);
		}
	}
	
}