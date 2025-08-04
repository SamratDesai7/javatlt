package org.assignment.tlt;

class Product {
    private int id;
    private String name;
    private int qty;
    private double price;

    public Product(int id, String name, int qty, double price) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }

    public double getTotal() {
        return qty * price;
    }

    public void display() {
        System.out.printf("%-5d %-15s %-10d %-10.2f %-10.2f\n", id, name, qty, price, getTotal());
    }
}

class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Shop {
    private Customer customer;
    private Product[] products;

    public void setProducts(Customer customer, Product... p) {
        this.customer = customer;
        this.products = p;
    }

    public void findBill() {
        if (customer == null || products == null || products.length == 0) {
            System.out.println("No products found for billing.");
            return;
        }

        System.out.println("Customer Name: " + customer.getName());
        System.out.println("-----------------------------------------------------------");
        System.out.printf("%-5s %-15s %-10s %-10s %-10s\n", "ID", "Product Name", "Quantity", "Price", "Total");
        System.out.println("-----------------------------------------------------------");

        double grandTotal = 0;
        for (Product p : products) {
            p.display();
            grandTotal += p.getTotal();
        }

        System.out.println("-----------------------------------------------------------");
        System.out.printf("%-42s %-10.2f\n", "Grand Total:", grandTotal);
    }
}

public class Q184_ShopBilling {
    public static void main(String[] args) {
        Customer c = new Customer("Rahul");

        Product p1 = new Product(101, "Pen", 10, 5.0);
        Product p2 = new Product(102, "Notebook", 3, 50.0);
        Product p3 = new Product(103, "Pencil", 5, 3.0);

        Shop shop = new Shop();
        shop.setProducts(c, p1, p2, p3);
        shop.findBill();
    }
}
