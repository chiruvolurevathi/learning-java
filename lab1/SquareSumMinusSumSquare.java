package basic;

import java.util.Scanner;

public class SquareSumMinusSumSquare {

	public static void main(String[] args) {
		int n,sum=0,s=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter up to which number you want");
		n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			sum=sum+i;
		}
		int k=sum*sum;
		System.out.println("square of sum"+k);
		for(int i=0;i<=n;i++)
		{
			s=s+(i*i);
		}	
		System.out.println("sum of square :"+s);
		int diff=s-k;
		System.out.println("difference between sum of squares and square of sum :"+diff);

	}

}
