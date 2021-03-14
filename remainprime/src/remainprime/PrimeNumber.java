package remainprime;

import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
					Scanner sc = new Scanner(System.in);
					System.out.println("enter the up to which you want prime numbers");
					int n= sc.nextInt();
					int count;
					String pf="";
					int i,j;
					for( i=1;i<=n;i++)
					{
						count=0;
						for( j=1;j<=i;j++)
						{
							if(i%j==0)
							{
								count++;
                                                                
								
							}	
						}
						if(count==2)
						{

                            System.out.println( "  "+i);	
						}
                                                
						
					}
                           
				}
}
						