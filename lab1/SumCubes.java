package lab1;

import java.util.Scanner;

public class SumCubes 
{

	public static void main(String[] args) {
	
		System.out.println("enter the number");
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		int sum=0;
		int i;
		while(num!=0)
		{
		   i=num%10;
		   sum=sum+(i*i*i);
		   num=num/10;
		  
		}
			System.out.println("sumof cube of given number is"+sum);
	}

}
