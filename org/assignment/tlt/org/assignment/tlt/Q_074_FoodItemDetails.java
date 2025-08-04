package org.assignment.tlt;

class FoodOrder {
    double calculateTotal(FoodItem... items) {
        double total = 0;
        for (FoodItem item : items) {
            total += item.price;
        }
        return total;
    }
}

public class Q_074_FoodItemDetails {
    public static void main(String[] args) {
        FoodItem item1 = new FoodItem("Burger", 120.0, 300);
        FoodItem item2 = new FoodItem("Pizza", 250.0, 600);
        FoodItem item3 = new FoodItem("Cold Drink", 50.0, 150);

        FoodOrder order = new FoodOrder();
        double total = order.calculateTotal(item1, item2, item3);

        System.out.println("Total Price: " + total);
    }
}

class FoodItem {
    String itemName;
    double price;
    int calories;

    FoodItem(String itemName, double price, int calories) {
        this.itemName = itemName;
        this.price = price;
        this.calories = calories;
    }
}

