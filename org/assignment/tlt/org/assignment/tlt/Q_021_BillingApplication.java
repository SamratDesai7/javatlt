package org.assignment.tlt;

class Q_021_Product {
    private int id;
    private String name;
    private int qty;
    private int rate;

    public Q_021_Product(int id, String name, int qty, int rate) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.rate = rate;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getQty() { return qty; }
    public int getRate() { return rate; }
    public int getTotal() { return qty * rate; }
}

class Q_021_Customer {
    private int id;
    private String name;
    private String contact;

    public Q_021_Customer(int id, String name, String contact) {
        this.id = id;
        this.name = name;
        this.contact = contact;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getContact() { return contact; }
}

class Q_021_Bill {
    void setOrder(Q_021_Customer c, Q_021_Product... products) {
        int totalWithoutGst = 0;

        System.out.println("Customer Id: " + c.getId() + "    Customer Name: " + c.getName() + "    Contact: " + c.getContact());
        System.out.println();
        System.out.printf("%-12s %-15s %-8s %-8s %-8s\n", "Product Id", "Product Name", "Qty", "Rate", "Total");

        for (Q_021_Product p : products) {
            int total = p.getTotal();
            totalWithoutGst += total;
            System.out.printf("%-12d %-15s %-8d %-8d %-8d\n", p.getId(), p.getName(), p.getQty(), p.getRate(), total);
        }

        System.out.println("--------------------------------------------------------------");
        double gst = totalWithoutGst * 0.18;
        double totalWithGst = totalWithoutGst + gst;

        System.out.printf("Total Bill Without GST : %d\n", totalWithoutGst);
        System.out.printf("Total bill With 18%% GST : %.0f\n", totalWithGst);
    }
}

public class Q_021_BillingApplication {
    public static void main(String[] args) {
        Q_021_Customer customer = new Q_021_Customer(1, "ABC", "123456789");

        Q_021_Product p1 = new Q_021_Product(1, "ABC", 10, 10);
        Q_021_Product p2 = new Q_021_Product(2, "PQR", 10, 100);
        Q_021_Product p3 = new Q_021_Product(3, "STV", 20, 100);

        Q_021_Bill bill = new Q_021_Bill();
        bill.setOrder(customer, p1, p2, p3);
    }
}
