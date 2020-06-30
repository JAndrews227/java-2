package burger_shop.exercise_twothree;

public class Calc {

    public static double calculateTotalPrice(double[] priceList) {
        double totalPrice = 0;
        for (int i = 0; i < priceList.length; i++) {
            totalPrice += priceList[i];
        }
        System.out.println("\nTotal price is: $" + totalPrice);
        return totalPrice;
    }
    
}