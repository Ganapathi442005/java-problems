import java.util.*;
public class Main {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s="a2b3c4";
    for(int i=0;i<s.length();i++)
    {
          char c=s.charAt(i);
          int m=(int)c-(int)'0';
      if(m<9)
      {
        for(int j=0;j<m;j++)
        {
             System.out.print(s.charAt(i-1));
        }
      }
    }
}
}
//for two digit words
*********************//
    import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        int n = str.length();
        int num = 0;
        for(int i=0;i<n-1;i++){
            num = num*10 + (str.charAt(i) - '0');
            char c = str.charAt(i+1);
            if("0123456789".indexOf(c)==-1){
                String temp = "";
                for(int j=0;j<num;j++){
                    temp += c;
                }
                System.out.print(temp);
                temp = "";
                num = 0;
                i++;
            }
        }
        if(num!=0){
            String temp = "";
            for(int j=0;j<num;j++){
                    temp += str.charAt(n-1);
            }
            System.out.print(temp);
        }
    }
}
