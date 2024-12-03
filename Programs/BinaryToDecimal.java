import java.util.Scanner;
public class BinaryToDecimal {

    public static void binToDecimal(int binaryNum){
        int myNum = binaryNum;
        int power = 0;
        int decimal = 0;

        while (binaryNum > 0) {
            int lastDigit = binaryNum % 10;
            decimal = decimal + (int)(lastDigit * Math.pow(2,power));
            power++;
            binaryNum = binaryNum / 10;
        }
        
        System.out.println("Conversion of binary number '"+myNum+"' to decimal is: "+decimal);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter binary number: ");
        int binNum = sc.nextInt();

        binToDecimal(binNum);
    }
}