import java.util.*;
class Main{
    public static void main(String[] args)
    {
        System.out.println("enter the no.of elements");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int d=lcmofarray(arr);
        System.out.println("the lcm is:"+d);
    }
    
    
    public static int hcf(int a,int b)
    {
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    
    
    public static int lcm(int a,int b){
        int c=(a*b)/hcf(a,b);
        return c;
    }
    
    public static int lcmofarray(int[] arr)
    {
       int result=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            result=lcm(result,arr[i]);
        }
        return result;
    }
}
