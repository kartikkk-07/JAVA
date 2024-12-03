public class TrapRainwater {
    public static int trapRainwater (int arr[]) {
        int width = 1;

        int leftMax[] = new int[arr.length];

        leftMax[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            leftMax[i] = Math.max(arr[i], leftMax[i-1]);
        }

        int rightMax[] = new int[arr.length];
        
        rightMax[arr.length-1] = arr[arr.length-1];
        for (int i = arr.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(arr[i], rightMax[i+1]);
        }

        int trapWater = 0;
        for (int i = 0; i < arr.length; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trapWater += (waterLevel - arr[i]) * width;
            if (trapWater < 0){
                trapWater = 0;
            }
        }
        return trapWater;
    }
    public static void main(String[] args) {
        int arr[] = {4,2,0,6,2,3,10};
        System.out.println("Total water trapped is: " + trapRainwater(arr));
    }
}