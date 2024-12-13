public class merge {

    int arr[];
    int tempMergeArr[];
    int length;

    public static void main(String[] args) {
        int arr[] = { 100, 22, 35, 14, 75, 16 };
        merge ms = new merge();
        ms.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void sort(int arr[]) {
        this.arr = arr;
        this.length = arr.length;
        this.tempMergeArr = new int[length];

        divideArr(0, length - 1);
    }

    public void divideArr(int lowerIndex, int higherIndex) {
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;

            divideArr(lowerIndex, middle);
            divideArr(middle + 1, higherIndex);

            mergeArr(lowerIndex, middle, higherIndex);
        }
    }

    public void mergeArr(int lowerIndex, int middle, int higherIndex) {
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergeArr[i] = arr[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;

        while (i <= middle && j <= higherIndex) {
            if (tempMergeArr[i] < tempMergeArr[j]) {
                arr[k] = tempMergeArr[i];
                i++;
            } else {
                arr[k] = tempMergeArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            arr[k] = tempMergeArr[i];
            k++;
            i++;
        }
    }
}
