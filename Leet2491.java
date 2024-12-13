import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet2491 {
    public static void main(String[] args) {
        int skills[] = { 2, 2, 2, 2 };

        if (skills.length % 2 != 0) {
            return;
        }

        Arrays.sort(skills);
        int i = 0;
        int j = skills.length - 1;
        ArrayList<Integer> temp = new ArrayList<>();
        List<int[]> pairs = new ArrayList<>();

        while (i < skills.length && i < j) {
            temp.add(skills[i] + skills[j]);
            pairs.add(new int[] { skills[i], skills[j] });

            i++;
            j--;
        }

        System.out.println("Pairs: ");
        for (int[] pair : pairs) {
            System.out.println(Arrays.toString(pair));
        }

        int result = 0;

        if (skills.length == 2) {
            result = skills[0] * skills[1];
        } else if (temp.stream().distinct().count() <= 1) {
            for (int[] pair : pairs) {
                System.out.println("First: " + pair[0] + " Second: " + pair[1]);
                result += pair[0] * pair[1];
            }
        } else {
            System.out.println("No team can be made");
        }

        System.out.println(temp);
        System.out.println(result);
    }
}
