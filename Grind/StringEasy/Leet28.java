package StringEasy;

public class Leet28 {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";

        if (haystack.contains(needle)) {
            System.out.println(haystack.indexOf(needle));
        }
    }
}
