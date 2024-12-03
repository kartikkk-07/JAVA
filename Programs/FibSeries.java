public class FibSeries {
    public static void main(String[] vk) {
        int num1 = 0;
        int num2 = 1;
        int num3 = 1;
        System.out.println("\nFibonacci Series is: ");
        System.out.print(num1+" "+num2+" ");

        while (num3 < 100) {
            num3 = num1 + num2;
                if (num3 <= 100)
                System.out.print(num3+" ");

            num1 = num2;
            num2 = num3;
        }
        
    }

}