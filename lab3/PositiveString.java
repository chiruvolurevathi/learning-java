import java.util.Scanner;

public class PositiveString {

	public static void main(String[] args) {
		String str;
		boolean result=true;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the data");
		str=sc.next();
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)>str.charAt(i+1))
			{
				result=false;
				break;
			}
		}
		System.out.println(result);
	}

}
