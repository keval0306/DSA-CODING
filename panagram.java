import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class panagram {
    public static void main(String[] args) {

        String s = "budbuefbwninnnniih";
        int arr[] = new int[s.length()];
        if (s.length() != 26) {
            System.out.println("String is not panagram");
        } else {
            for (char c : s.toCharArray()) {
                System.out.println(c);
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
