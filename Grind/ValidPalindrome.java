
/*
 Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
 */

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        s = s.toLowerCase();
        String f = "";
        char arr[] = s.toCharArray();
        for (char c : arr) {
            System.out.print(c + " ");
        }

        for (int i : arr) {
            if (i >= 97 && i <= 122) {
                f = f + (char) i;
            }

        }
        char a[] = f.toCharArray();
        for (int i = 0; i < f.length(); i++) {

        }
        System.out.println(f);

    }
}