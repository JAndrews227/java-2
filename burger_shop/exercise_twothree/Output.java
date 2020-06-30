package burger_shop.exercise_twothree;




import Menu;


public class Output {

    public static void printReceipt() {
        System.out.println("\nYour receipt:\n");
    }

    public static void printMeatAndBunType(final String meatType, final String bunType) {
        System.out.println("Selected meat: " + meatType);
        System.out.println("Selected bun: " + bunType);
        System.out.println("");

    }

    public static void printItems(int i, final Menu item) {
        final String name = item.getName();
        final double price = item.getPrice();
        i += 1;
        System.out.println("Item " + i + ": " + name + ", price: $" + price);
    }
}