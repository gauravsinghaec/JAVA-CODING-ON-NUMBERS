package num.check;

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] arg){
	
		System.out.println("Please enter the number: ");
		Scanner scan =new Scanner(System.in);
		int num = scan.nextInt();
		int F=factorial(num);
		System.out.println("The factorial of "+num+" is "+F);
	}
	private static int factorial(int n){
		if (n>1)
			n=n*factorial(n-1);
		return n;		
	}
}
