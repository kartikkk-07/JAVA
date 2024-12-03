// Check if array is sorted or not
public class Recursion5 {

    public static boolean arrIsSorted (int arr[] , int i) {

        if ( i == arr.length - 1) {
            return true;
        }

        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return arrIsSorted(arr, i + 1);
    }

    public static void main(String[] args) {
        int a[] = {1,3,5,7,9,5};
        System.out.println(arrIsSorted(a , 0));
    }
}