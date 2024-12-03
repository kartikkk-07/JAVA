public class Recursion8 {

    public static int powerOpt (int num , int x) {
        if(x == 0) {
            return 1;
        }

        int halfPower = powerOpt(num , x/2);
        int halfPowerSq = halfPower * halfPower;

        if(x % 2 != 0) {
            return num * halfPowerSq;
        }

        return halfPowerSq;
    }

    public static void main(String[] args) {
        System.out.println(powerOpt(2 , 5));
    }
}