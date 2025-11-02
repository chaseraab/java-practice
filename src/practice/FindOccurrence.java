package practice;


import java.util.HashMap;




public class FindOccurrence {

    public static int maxProfit(int[] prices) {
        int low = prices[0];
        int high = 0;
        for (int curPrice: prices) {
            if (low > curPrice) {low = curPrice;}
            if (high < curPrice) {high = curPrice;}
        }
        int profit = (high - low) > 0? high-low : 0;
        return profit;
    }


    public static void main(String args[]) {

        int[] t1 = {6,5,5};
        System.out.println(maxProfit(t1));
    }
}
