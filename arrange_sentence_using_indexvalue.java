import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the sentence");
        String sentence = sc.nextLine();
        String[] words= sentence.split(" ");
        int a=words.length;
        String[] ansstr=new String[a];
        for(int i=0;i<a;i++)
        {
            String temp=words[i];
            int lastpos=temp.length()-1;
            int num=(int)temp.charAt(lastpos)-(int)'0';
            String ans="";
            for(int j=0;j<temp.length()-1;j++)
            {
                ans=ans+temp.charAt[j];
                
            }
            ansstr[num]=ans;
        }
        
        for(int i=0;i<ansstr.length;i++)
        {
            System.out.println("ans:"+ansstr[i]);
        }
    }
}
