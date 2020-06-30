package burger_shop.exercise_twothree;

import Menu;
import Output;

import java.util.ArrayList;

public class Order {
    private int orderNumber = 0; //todo
    private int id;
    private String meatType;
    private String bunType;

    private ArrayList<Menu> orderList;

    public Order() {
        this.orderList = new ArrayList<Menu>();
    }

    public void createOrder() {
        orderNumber++;
    }

    public void addBurgerToOrder(int id, String meat, String bun) {
        if (id == 1000) {
            orderList.add(Menu.createHamburger(meat, bun));
            meatType = meat;
            bunType = bun;
        }
        if (id == 1001) {
            orderList.add(Menu.createHealthyBurger(meat));
            meatType = meat;
            bunType = "Brown Rye Bread"; //todo
        }
        if (id == 1002) {
            orderList.add(Menu.createDeluxeBurger(meat, bun));
            meatType = meat;
            bunType = bun;
        }

    }

    public void addSideToOrder(int id) {
        orderList.add(Menu.createSideItem(id));
    }

    public void getTotalPrice() {
        double[] priceList = new double[orderList.size()];
        for (int i = 0; i < orderList.size(); i++) {
            priceList[i] = orderList.get(i).getPrice();
        }
        Calc.calculateTotalPrice(priceList);
        orderList.clear();
    }

    public void printReceipt(){
        System.out.println("\nOrder number is " + orderNumber);
        Output.printReceipt();
        Output.printMeatAndBunType(meatType,bunType);
        passToOutput(orderList);
    }

    private void passToOutput(ArrayList<Menu> orderList) {
        for (int i = 0; i < orderList.size(); i++) {
            passItem(i, orderList.get(i));
        }
    }

    private void passItem(int i, Menu item) {
        Output.printItems(i, item);
    }
}