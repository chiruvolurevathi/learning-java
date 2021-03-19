import java.io.BufferedReader;
import java.util.Scanner;

public class DifOfConsecutive {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		StringBuffer sb=new StringBuffer(" "); 
		System.out.println("enter the number :");
		num=sc.nextInt();
		String s=String.valueOf(num);
		String diff=" ";
			for(int i=0;i<s.length();i++)
			{
				if(i<s.length()-1) {
				diff=diff+(s.charAt(i)-s.charAt(i+1));
				}
				else {
					diff=diff+s.charAt(i);
				}
			}
			char[] ch = new char[diff.length()]; 
	        for (int i = 0; i < diff.length(); i++) { 
	            ch[i] = diff.charAt(i); 
	        } 
	       // int n = Integer.parseInt(new String(ch));
		System.out.println("diff number :"+diff);
		
	}

}
