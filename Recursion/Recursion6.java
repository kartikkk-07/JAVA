public class Recursion6 {

    public static int lastOcc (int arr[] , int key , int i) {
        if (i < 0) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return lastOcc(arr, key, i - 1);
    }

    public static int firstOcc (int arr[] , int key , int i) {
        if (i == arr.length - 1) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOcc(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = {1,3,5,3,2,6,5};
        int key = 5;
        System.out.println(firstOcc(arr , key , 0));

        System.out.println(lastOcc(arr , key , arr.length - 1));
    }
}