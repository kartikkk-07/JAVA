// Max sub array using kadans algorithm
public class Kadans {
    public static void maxSubArray (int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 1; i < arr.length; i++) {
            currentSum = currentSum + arr[i];
            if (currentSum < 0) {
                currentSum = 0;
            }
            maxSum = Math.max(maxSum, currentSum);
        }
        System.out.println("Max subarray sum is: " +maxSum);
    }

    public static void main(String[] args) {
        int arr[] = {-1,-2,4,-1,5,6,8};
        maxSubArray(arr);
    }
}