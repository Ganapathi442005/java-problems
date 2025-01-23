import java.util.*;
class Main{
      public static int gcd(int a,int b)
      {
          while(b!=0)
          {
              int temp=b;
              b=a%b;
              a=temp;
          }
          return a;
      }
      
      
      public static void main(String[] args)
      {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter first number");
          int a=sc.nextInt();
          System.out.println("Enter second number");
          int b=sc.nextInt();
          int c=gcd(a,b);
          int d=(a*b)/c;
          System.out.println("the lcm of two numbers is:"+d);
      }
}
