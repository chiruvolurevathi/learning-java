import java.util.ArrayList;
		import java.util.Arrays;				
public class ConscuteLength {
	public static void main(String[] args) { int k,max=0,count=0;
                int [] array =  {49,1,3,200,2,4,70,5,42,43,44,45,46,47,48,60,70,80,90}; 
				Arrays.sort(array); 
				ArrayList<Integer> big= new ArrayList<Integer>();
				System.out.println("Elements of array sorted in ascending order: ");   
				for (int i = 0; i < array.length-1; i++)   
				{       
				System.out.print(array[i]+" ");   
				}   
				System.out.println("");
				for(int j=0;j<array.length-1;j++)
				{if(array[j+1]-array[j]==1) {   big.add(array[j]);  }}
                    int arr[]=new int[big.size()];
                    System.out.print(" sorted array   :");
				 for (int i = 0; i < big.size(); i++) 
				 {  
					 arr[i] = big.get(i); 
					 System.out.print(arr[i]+" ");
				}
			     for(int i=0;i<arr.length-1;i++) { 
					if(arr[i+1]-arr[i]==1)
					    {  count++;  }
					else if(arr[i+1]-arr[i]!=1) { k=count;count=0;  if(max<k) {  max=k;  }
						}}System.out.println("");
			     if(max<count)
			     { System.out.println("max consequent length  :"+count);}
			     else
			     { System.out.println("max consequent length  :"+max+1);}
	}}
