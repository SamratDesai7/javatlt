package org.assignment.tlt;

class Q_023_Product {
    private int id;
    private String name;
    private double price;

    public Q_023_Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
}

public class Q_023_ProductPriceMatch {
    public static void main(String[] args) {
        Q_023_Product[] products = new Q_023_Product[10];

        products[0] = new Q_023_Product(1, "Pen", 10.0);
        products[1] = new Q_023_Product(2, "Pencil", 5.0);
        products[2] = new Q_023_Product(3, "Notebook", 50.0);
        products[3] = new Q_023_Product(4, "Eraser", 5.0);
        products[4] = new Q_023_Product(5, "Sharpener", 10.0);
        products[5] = new Q_023_Product(6, "Marker", 20.0);
        products[6] = new Q_023_Product(7, "Scale", 15.0);
        products[7] = new Q_023_Product(8, "Glue", 20.0);
        products[8] = new Q_023_Product(9, "Stapler", 50.0);
        products[9] = new Q_023_Product(10, "Highlighter", 15.0);

        boolean found = false;
        System.out.println("Products with same price:");
        for (int i = 0; i < products.length; i++) {
            for (int j = i + 1; j < products.length; j++) {
                if (products[i].getPrice() == products[j].getPrice()) {
                    System.out.println("Product 1: " + products[i].getName() + " - ₹" + products[i].getPrice());
                    System.out.println("Product 2: " + products[j].getName() + " - ₹" + products[j].getPrice());
                    System.out.println("-------------------------------");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No products found with same price.");
        }
    }
}
