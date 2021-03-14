class RevofDigits{
   public static void main(String[] args)
  {
     int num=123456;
      int rev=0;
      int r1;
       while(num!=0)
        {
           r1=num%10;
           rev=(rev*10)+r1;
            num=num/10;
         }
System.out.println("rev num is"+ rev);
}
}