import java.util.Scanner;

class Fibonacci{
   public static void main(String[] args)
   {
     int i;
     int f0=0,f1=1;
     int f2;
     Scanner sc= new Scanner(System.in);
     System.out.println("enter up to which number you want ");
		int num = sc.nextInt();
     System.out.print("fib series "+f0);
     System.out.print("fib series "+f1);
     for(i=0;i<num;i++)
         {
            f2=f0+f1;
            f0=f1;
            f1=f2;
      System.out.println("fib series "+f2);
      }

	}

}
