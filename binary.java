public class binary {
    public static void main(String[] args) {
        int arr[] = { 1, 10, 20, 47, 59, 65, 75, 88, 99 };
        int target = 88;
        int low = 0;
        int high = arr.length - 1;
        int flag = 0;
        while (low <= high) {

            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                flag = 1;
                System.out.print(mid);
                break;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (flag == 0) {
            System.out.println("No...");
        }
    }
}
