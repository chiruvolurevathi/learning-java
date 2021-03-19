package basic;
import java.util.Scanner;
public class PowerOfTwo {
public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number  :");
		n=sc.nextInt();
		  while(n%2==0)
		  {
		   n=n/2;
		  }
		  if(n==1)
		  {
		  System.out.println("given number is power of 2");
		  }
		  else
		  {
			  System.out.println("given number is not  power of 2");
		  }
		 }
}


