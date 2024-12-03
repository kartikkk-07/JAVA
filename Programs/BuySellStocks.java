public class BuySellStocks {
    public static int buySellStock ( int stocks[] ) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < stocks.length; i++) {
            if ( buyPrice < stocks[i] ) {
                int profit = stocks[i] - buyPrice;
                maxProfit = Math.max( profit , maxProfit );
            } else {
                buyPrice = stocks[i];
            }
        }
        return maxProfit;
    }
    public static void printArray (int arr[]) {
        System.out.print("\nArray is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int stocks[] = {7,1,5,3,6,4};
        printArray(stocks);
        System.out.println("Maximum profit is: " + buySellStock(stocks) + "\n");
    }
}