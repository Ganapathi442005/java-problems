import java.util.*;
class Main{
    public static void main(String[] args)
    {
        String[] arr={"geem","geekdd","geebdekefek","geerf"};
        Arrays.sort(arr);
        String s=arr[0];
        String s1=arr[arr.length-1];
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==s1.charAt(i))
            {
                System.out.print(s.charAt(i));
            }
            else{
                break;
            }
        }
    }
}
