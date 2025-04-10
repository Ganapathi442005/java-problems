import java.util.*;
public class subarray {
    public static boolean subarray(int[] arr1,int[] arr2)
    {
             if(arr2.length==0)
             {
                return true;
             }
             if(arr2.length>arr1.length)
             {
             return false;
             }
             for(int i=0;i<=arr1.length-arr2.length;i++)
             {
                boolean match=true;
                for(int j=0;j<arr2.length;j++)
                {
                    if(arr1[i+j]!=arr2[j])
                    {
                          match= false;
                          break;
                    }
                }
                if (match){
                    return true;
                }
             }
             return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int[]arr1=new int[a];
        int[]arr2=new int[b];
        for(int i=0;i<a;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<b;i++)
        {
            arr2[i]=sc.nextInt();
        }
        boolean resullt=subarray(arr1,arr2);
        System.out.println("the result after checking is"+resullt);
    }
}
