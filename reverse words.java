import java.util.*;
class reverse_words{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the sentence");
    String sentence=sc.nextLine();
    String reversedsentence=reversed_sentence(sentence);
    System.out.println("the reverse sentence is"+" "+reversedsentence);
    
    
  }
    
   public static String reversed_sentence(String sentence)
   {
       String[] words=sentence.split(" ");
       StringBuilder r=new StringBuilder();
       for(int i=words.length-1;i>=0;i--)
       {
           r.append(words[i]).append(" ");
       }
     String m=  r.toString().trim();
       return m;
   }
    
}
