import java.util.Scanner;

public class MethodMirrorImage {
	public  void getMethod() {
   Scanner sc= new Scanner(System.in);
		System.out.println("enter the string :");
		String j= sc.nextLine();
		String k=j;
		StringBuffer sb=new StringBuffer(j);
		sb.reverse();
		j=sb.toString();
		System.out.println(k+" | "+j);	
	}
	}
