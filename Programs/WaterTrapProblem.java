import java.util.Scanner;

public class WaterTrapProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height[] = new int[12];
        System.out.print("Enter total 12 array elements: ");

        for (int i = 0; i < height.length; i++) {
            height[i] = sc.nextInt();
        }
        System.out.println("");

        int lmax = height[0];
        int larr[] = new int[12];

        for (int i = 0; i < 12; i++) {
            if (lmax < height[i]) {
                larr[i] = height[i];
                lmax = height[i];
            } else {
                larr[i] = lmax;
            }
        }
        for (int i = 0; i < 12; i++) {
            System.out.print(larr[i] + "  ");
        }


        int rmax = height[11];
        int rarr[] = new int[12];


        for (int i = 11; i >= 0; i--) {
            if (rmax < height[i]) {
                rarr[i] = height[i];
                rmax = height[i];
            } else {
                rarr[i] = rmax;
            }
        }
        System.out.println("\n");
        for (int i = 0; i < 12; i++) {
            System.out.print(rarr[i] + "  ");
        }

        System.out.println("\n");
        int TotalWaterTrap = 0;
        for (int i = 0; i < 12; i++) {
            int temp = (Math.min(larr[i], rarr[i])) - height[i];
            System.out.print(temp + "  ");
            TotalWaterTrap = TotalWaterTrap + temp;
        }
        System.out.println("\n\nTotal Water Trapped = " + TotalWaterTrap + "\n");
    }
}