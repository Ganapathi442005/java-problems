
import java.util.Scanner;
public class permutation {
  
    public static void permute(String str, String name) {
        if (str.length() == 0) {
            System.out.println(name);
        }
        else {
            for (int i = 0; i < str.length(); i++) {
                String newStr = str.substring(0, i) + str.substring(i + 1);
                String newName = name + str.charAt(i);
                permute(newStr, newName);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        permute(str, "");
}
}
