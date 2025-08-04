package org.assignment.tlt;

class Customer {
    int id;
    String name;
    String email;
    String contact;

    public Customer(int id, String name, String email, String contact) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.contact = contact;
    }
}

class Product {
    int id;
    String name;
    int qty;
    double rate;
    double total;

    public Product(int id, String name, int qty, double rate) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.rate = rate;
        this.total = qty * rate;
    }
}

public class Q_031_Order {
    Customer customer;
    Product[] products;

    public Q_031_Order(Customer customer, Product... products) {
        this.customer = customer;
        this.products = products;
    }

    public void showOrder() {
        System.out.println("Customer ID : " + customer.id);
        System.out.println("Customer Name: " + customer.name);
        System.out.println("Customer Email: " + customer.email);
        System.out.println("Customer Contact : " + customer.contact);
        System.out.println("Product Details");
        System.out.println("____________________________________________");
        System.out.printf("%-5s %-10s %-10s %-10s %-10s\n", "ID", "NAME", "Quantity", "Rate", "Total");
        System.out.println("____________________________________________");

        double grandTotal = 0;
        for (Product p : products) {
            System.out.printf("%-5d %-10s %-10d %-10.2f %-10.2f\n", p.id, p.name, p.qty, p.rate, p.total);
            grandTotal += p.total;
        }

        System.out.println("____________________________________________");
        System.out.println(" Total : " + grandTotal);
    }

    public static void main(String[] args) {
        Customer c = new Customer(1, "Ram", "ram@gmail.com", "9999999999");

        Product p1 = new Product(1, "A", 10, 10);
        Product p2 = new Product(2, "B", 10, 100);
        Product p3 = new Product(3, "C", 20, 200);

        Q_031_Order order = new Q_031_Order(c, p1, p2, p3);
        order.showOrder();
    }
}
