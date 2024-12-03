public class quickSort {

    public static void quickSort (int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pivotIndex = partition(arr, si, ei);
        quickSort(arr, si, pivotIndex-1);
        quickSort(arr, pivotIndex+1, ei);
    }

    public static int partition (int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si-1;

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void printArr (int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1,5,2,4,8,6,3,5};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}