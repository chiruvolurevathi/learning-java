
public class AssignmentString {

	public static void main(String[] args) {
		String str ="hello my dear friends";
		String s[] =str.split(" ");
		int  n =s.length-1;
		for(int i=n;i>=0;i--)
		{
			System.out.print(s[i]+ " ");
		}
	}
}
