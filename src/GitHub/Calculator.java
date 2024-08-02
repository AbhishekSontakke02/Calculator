package GitHub;

import java.util.Scanner;

public class Calculator {
	static Scanner sc = new Scanner(System.in);
	static int a,b,result;
	static String oprator;
	public static void main(String[] args) {
		System.out.println("Welcome to Calculator!");
		System.out.println("Enter the Value Of A = ");
		a =  Integer.parseInt(sc.nextLine());
		System.out.println("Enter the Value Of B = ");
		b = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the Opration to perform:");
		oprator = sc.nextLine().trim().toLowerCase();
		switch(oprator) {
		case "add":
			result = add(a,b);
			System.out.println(result);
			break;
		default :
			System.out.println("Enter Valid Opration");
		}
		
	}
	private static int add(int a , int b) {
		return a+b;
	}
	
}
