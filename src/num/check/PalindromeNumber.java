package num.check;

public class PalindromeNumber {
	public static void main(String[] arg){
		int num[] = new int[]{11,15,25,34,22,121,3454,2442};
		
		for (int i=0; i< num.length; i++)
		{
			
			int n,rev=0,rem;
			n=num[i];
			while(n>0)
			{	
				rem = n%10;
				rev = rev*10+ rem;
				n=n/10;
			}
			if (num[i] == rev)
				System.out.println(num[i]+" is a Palindrome Number");
			else
				System.out.println(num[i]+" is not a Palindrome Number");
		}
	}

}
