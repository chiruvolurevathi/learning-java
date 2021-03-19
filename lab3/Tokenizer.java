import java.util.Scanner;
public class Tokenizer {
public static void main(String[] args) {
		int sum=0;
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size ");
		size= sc.nextInt();
		int [] a=new int[size];
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter the integer values you want: ");
		for(int i=0;i<size;i++)
		{
			a[i]=sc1.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			System.out.print(a[i]+" , ");
		} System.out.println(" ");
		for(int i=0;i<size;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("sum is :"+sum);
	}
}
