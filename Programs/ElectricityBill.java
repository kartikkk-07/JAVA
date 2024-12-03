import java.util.*;
public class ElectricityBill {
    public static float calculateElectricityBill (int units) {
        float bill = 0;
        if (units < 100) {
            bill = units * 4.71f;
        } else if (units < 300) {
            bill = 100 * 4.71f + (units - 100) * 10.29f;
        } else if (units < 500) {
            bill = 100 * 4.71f + 200 * 10.29f + (units - 300) * 14.55f;
        } else {
            bill = 100 * 4.71f + 200 * 10.29f + 200 * 14.55f + (units - 500) * 16.64f;
        }
        return bill;
    }
    public static float calculateFuelCharges (int units) {
        float fuelCharges = 0;
        if (units < 100) {
            fuelCharges = units * 0.40f;
        } else if (units < 300) {
            fuelCharges = 100 * 0.40f + (units - 100) * 0.70f;
        } else if (units < 500) {
            fuelCharges = 100 * 0.40f + 200 * 0.70f + (units - 300) * 0.95f;
        } else {
            fuelCharges = 100 * 0.40f + 200 * 0.70f + 200 * 0.95f + (units - 500) * 0.05f;
        }
        return fuelCharges;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter units to calculate Electricity Bill: ");
        int units = sc.nextInt();
        float FixedCharges = 128.0f;
        System.out.print("\nFixed Charges: Rs " + FixedCharges);
        float ElectricityCharges = calculateElectricityBill(units);
        System.out.print("\nVariable Charges (Electricity): Rs " + ElectricityCharges);
        float FuelCharges = calculateFuelCharges(units);
        System.out.print("\nVariable Charges (Fuel): Rs " + FuelCharges);
        float ConductionCharges = units * 1.17f;
        System.out.println("\nConduction Charges Rs 1.17 per unit: Rs " + ConductionCharges);
        float AllCharges = FixedCharges + ElectricityCharges + FuelCharges + ConductionCharges;
        float ElectricityCharge = (AllCharges * 16) / 100;
        System.out.println("Additional Electricity Charge 16% of " + AllCharges + ": Rs " + ElectricityCharge);
        float finalBill = AllCharges + (AllCharges * 16)/100;
        System.out.println("\nFinal Electricity Bill: Rs " + finalBill + "\n");
        sc.close();
    }
}