import java.util.*;
class hcf_3_numbers{
    public static int HCF(int a,int b)
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
        System.out.println("enter first number");
        int a=sc.nextInt();
        System.out.println("enter second number");
        int b=sc.nextInt();
        System.out.println("enter third number");
        int c=sc.nextInt();
        int ans=HCF(HCF(a,b),c);
        System.out.println("HCF of "+a+" "+"and"+" "+b+ " "+ "is" +" "+ans );
    }
}
