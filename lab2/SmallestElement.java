import java.util.Arrays;
import java.util.Scanner;

public class SmallestElement {

	public static void main(String[] args) {
	int n,i;
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the array size");
	n=sc.nextInt();
	//getArray();
	int [] arr=new int[n];
	 System.out.println("enter the array of integer elements");
     for(i=0;i<n;i++)
     {
    	 arr[i]=sc.nextInt();
    }
     Arrays.sort(arr);
     for(i=0;i<n;i++)
     {
    	 System.out.print(arr[i+1]+" ");
    	 break;
     }	
	}

}
