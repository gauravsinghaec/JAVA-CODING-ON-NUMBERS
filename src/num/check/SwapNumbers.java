package num.check;

import java.util.Scanner;

public class SwapNumbers {
	public static void main(String[] arg){
		System.out.println("Enter the first number: ");
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter the second number: ");
		Scanner scan2 = new Scanner(System.in); 
		int x = Integer.parseInt(scan1.nextLine());
		int y = Integer.parseInt(scan2.nextLine());
		
		System.out.println("1st Number= "+x+" 2nd Number= "+y +" before swapping");
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("1st Number= "+x+" 2nd Number= "+y +" after swapping");
	}
}
