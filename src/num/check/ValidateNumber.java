package num.check;
import java.util.Scanner;

public class ValidateNumber {
	String name;
	int num;
	public void getWord(){
		System.out.println("Enter the string to validate: ");
		Scanner scan = new Scanner(System.in);
		name = scan.nextLine();
	}
	public void getNum(){
		System.out.println("Enter the number to validate: ");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		
//*****Below to show the use of try and catch block
		
//		name = scan.nextLine();
//		try{
//		num = Integer.parseInt(name);
//		}
//		catch(NumberFormatException e){
//			System.out.println("Please enter a valid number");
//			System.exit(0);
//		}
	}	
	public void checkPelindrome(){
		char temp[] = new char[name.length()];
		String rev = "";
		for(int i=0; i<name.length();i++)
		{
			temp[i] = name.charAt((name.length()-1)-i);
			rev = rev + temp[i];
		}
		if (name.equals(rev))
			System.out.println(name + " is a Pelindrome string");
		else 
			System.out.println(name + " is not a Pelindrome string");
	}
	public void checkPerfect(){
		int sum = 0;
		for (int i=1;i<num;i++)
		{
			if(num%i==0)
				sum = sum + i;
		}
		if (num == sum)
			System.out.println(num + " is a Perfect Number");
		else 
			System.out.println(num+" is not a Perfect number");
	}
	public void checkArmstrong(){
		int cubesum =0,rem,n=num;
		while (n>0)
		{
			rem=n%10;
			cubesum=cubesum + (rem*rem*rem);
			n = n/10;
		}
		if (num == cubesum)
			System.out.println(num +" is an Armstrong number");
		else
			System.out.println(num +" is not an Armstrong number");
	}
	protected void checkPrime(){
		boolean isPrime = true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				isPrime = false;
				break;
			}
			else
			{
				isPrime = true;
				break;
			}
		}
		if (isPrime)
			System.out.println(num +" is a Prime Number");
		else
			System.out.println(num +" is not a Prime Number");
	}
}