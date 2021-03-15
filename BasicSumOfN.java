package basic;

import java.util.Scanner;

public class BasicSumOfN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the up to which you want sum divisible 3 and 5 numbers");
		int n= sc.nextInt();
		int i;
		int sum=0;
		for(i=1;i<=n;i++)
		{
			if(i%3==0 && i%5==0)
			{
				sum=sum+i;
				
			}
			
		}
		System.out.println(sum);

	}

}
