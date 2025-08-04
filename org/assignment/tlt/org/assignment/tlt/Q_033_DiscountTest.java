package org.assignment.tlt;

class Discount {
    protected int qty;
    protected int rate;

    public void setProdDetail(int qty, int rate) {
        this.qty = qty;
        this.rate = rate;
    }

    public int getDiscountAmount() {
        return 0;
    }
}

class NewCustomer extends Discount {
    @Override
    public int getDiscountAmount() {
        int total = qty * rate;
        return (total * 10) / 100; 
    }
}

class OldCustomer extends Discount {
    @Override
    public int getDiscountAmount() {
        int total = qty * rate;
        return (total * 20) / 100; 
    }
}

public class Q_033_DiscountTest {
    public static void main(String[] args) {
        Discount d;

        d = new NewCustomer();
        d.setProdDetail(5, 200);
        System.out.println("New Customer Discount: " + d.getDiscountAmount());

        d = new OldCustomer();
        d.setProdDetail(5, 200);
        System.out.println("Old Customer Discount: " + d.getDiscountAmount());
    }
}
