package burger_shop.exercise_twothree;

public class Menu {
    private final int id;
    private final String name;
    private final double price;

    public Menu(final int id, final String name, final double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public static Menu createHamburger(final String meat, final String bun) {
        return new Hamburger(1, "Hamburger", 4.59, meat, bun);
    }

    public static Menu createHealthyBurger(final String meat) {
        return new HealthyBurger(2, "Healthy Burger", 4.49, meat);
    }

    public static Menu createDeluxeBurger(final String meat, final String bun) {
        return new DeluxeBurger(3, "Deluxe Burger", 8.99, meat, bun);
    }

    public static Menu createSideItem(final int id) {
        if (id == 1) {
            return new Side(id, "Cheese", .75);
        }

        if (id == 2) {
            return new Side(id, "Lettuce", 0);

        }
        if (id == 3) {
            return new Side(id, "Tomato", 0);

        }
        
        if (id == 4) {
            return new Side(id, "Pickles", 0);

        }

        if (id == 5) {
            return new Side(id, "EXTRA Pickles!", .50);
        }

        if (id == 6) {
            return new Side(id, "Onion", 0);

        }
        
        if (id == 7) {
            return new Side(id, "Coca-Cola", 1.5);

        }
        if (id == 8) {
            return new Side(id, "Dr. Pepper", 1.5);

        }
        if (id == 9) {
            return new Side(id, "Sweet Tea", 1.5);

        }

        if (id == 10) {
            return new Side(id, "Fries", 2.5);

        }
        if (id == 11) {
            return new Side(id, "Onion Rings", 3.0);

        }
        return null;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}