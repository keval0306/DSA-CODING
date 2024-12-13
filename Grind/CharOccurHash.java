import java.util.Scanner;

public class CharOccurHash {
    public static void main(String[] args) {
        System.out.println("Enter String :");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println("Enter the character that You wanted to see how much time occurs in a string ");
        char c1 = sc.next().charAt(0);

        int hash[] = new int[26];

        char c[] = s.toCharArray();

        for (char d : c) {
            if (d == c1) {
                hash[d - 'a'] += 1;
            }
        }

        System.out.println("Number Occurrence of character " + c1 + " is :" + hash[c1 - 'a']);
    }
}
