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
      
      
      public static int lcm(int a,int b)
      {
          return (a*b)/gcd(a,b);
      }
      
      
      public static int lcmofarray(int[] ans)
      {
          int result=ans[0];
          for(int i=1;i<ans.length;i++)
          {
             result=lcm(result,ans[i]);
          }
          return result;
      }
      
      
      
      public static void main(String[] args)
      {
          Scanner sc=new Scanner(System.in);
          System.out.println("enter the no of elements");
          int n=sc.nextInt();
          int[] arr=new int[n];
          System.out.println("enter the elements");
          for(int i=0;i<n;i++)
          {
              
              arr[i]=sc.nextInt();
          }
          int a=lcmofarray(arr);
         
          System.out.println("the lcm of the array is:"+a);
      }
}
