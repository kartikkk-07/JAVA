import java.util.Scanner;

public class DecimalToBinary {

    static void decimalToBinary(int decimalNum) {
        int decimal = decimalNum;
        int binary = 0;
        int power = 0;

        while (decimalNum > 0) {
            int rem = decimalNum % 2;
            binary = binary + (int)(rem * Math.pow(10, power));
            power++;
            decimalNum = decimalNum / 2;
        }

        // Format the binary number to 8 bits
        String binaryString = String.format("%08d", binary);
        System.out.println("Conversion of decimal number '" + decimal + "' to binary is: " + binaryString);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter decimal number: ");
        int decNum = sc.nextInt();

        decimalToBinary(decNum);
    }
}

// import java.util.Scanner;

// public class DecimalToBinary {

//     static void decimalToBinary(int decimalNum) {
//         int decimal = decimalNum;
//         StringBuilder binary = new StringBuilder();

//         // Convert decimal to binary
//         while (decimalNum > 0) {
//             int rem = decimalNum % 2;
//             binary.insert(0, rem);
//             decimalNum = decimalNum / 2;
//         }

//         // Pad with leading zeros to ensure 8 bits
//         while (binary.length() < 8) {
//             binary.insert(0, "0");
//         }

//         // Handle the case for 0 explicitly
//         if (binary.length() == 0) {
//             binary.append("00000000");
//         }

//         // Print the result
//         System.out.println("Conversion of decimal number '" + decimal + "' to binary is: " + binary.toString());
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("\nEnter decimal number: ");
//         int decNum = sc.nextInt();

//         decimalToBinary(decNum);
//     }
// }