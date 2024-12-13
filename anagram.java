import java.util.Scanner;
import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String1 :");
        String s1 = sc.nextLine();
        System.out.println("Enter String2 :");
        String s2 = sc.nextLine();

        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
        } else {
            char c1[] = s1.toCharArray();
            char c2[] = s2.toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);

            String str1 = new String(c1);
            String str2 = new String(c2);

            if (str1.equals(str2)) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not Anagram");
            }
        }
    }
}
