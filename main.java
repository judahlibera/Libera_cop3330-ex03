import java.util.*;
public class main {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.printf("What is the quote? ");
        String str1 = sc.nextLine();
        System.out.printf("Who said it? ");
        String str2 = sc.nextLine();
        String str3 = str2 + " says, \"" + str1 + "\"";
        System.out.printf("%s", str3);
    }
}