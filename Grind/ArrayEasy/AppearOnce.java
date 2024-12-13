package ArrayEasy;

/*
 
 */
public class AppearOnce {
    public static void main(String[] args) {
        int arr[] = { 4, 1, 2, 1, 2 };

        // basic approach

        // int hash[] = new int[arr.length];
        // for (int i = 0; i < arr.length; i++) {
        // hash[arr[i]]++;
        // }

        // for (int i = 0; i < hash.length; i++) {
        // if (hash[i] == 1) {
        // System.out.println(i);
        // }
        // }

        // for (int i : hash) {
        // System.out.print(i + " ");
        // }

        // better approach
        int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            res = res ^ arr[i];
        }
        System.out.println(res);
    }
}
