package basic;
import java.util.Scanner;
public class IncresingNumber {

	public static void main(String[] args) {
	int count=0;
		Scanner sc= new Scanner(System.in);
	System.out.println("enter the number");
	int n = sc.nextInt();
	String s=String.valueOf(n);
			for(int i=0;i<s.length();i++)
		      {
				if(s.charAt(i)>s.charAt(i+1))
				{
				    count++;
		        }
			  }
		if(count>1) 
		{
		    System.out.println("given number is negative number");
		}
		else
		{
			System.out.println("given number is positive");
		}
	}

}
