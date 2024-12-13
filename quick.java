public class quick {
    public static void main(String[] args) {
        int arr[] = { 100, 22, 35, 14, 75, 16 };
        quick qs = new quick();
        qs.quickSortAlgo(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    int partition(int arr[], int low, int high) {
        int pivot = arr[(low + high) / 2];

        while (low <= high) {
            while (arr[low] < pivot) {
                low++;
            }
            while (arr[high] > pivot) {
                high--;
            }
            if (low <= high) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;

                high--;
            }
        }
        return low;
    }

    void quickSortAlgo(int arr[], int low, int high) {
        int pi = partition(arr, low, high);
        if (low < pi - 1) {
            quickSortAlgo(arr, low, pi - 1);
        }
        if (high < pi) {
            quickSortAlgo(arr, pi, high);
        }
    }
}
