package org.assignment.tlt;

class ProductOutOfStockException extends RuntimeException {
    public ProductOutOfStockException(String message) {
        super(message);
    }
}

class StockManagement {
    private int productCount;

    public StockManagement(int productCount) {
        this.productCount = productCount;
    }

    public void sellProduct(int quantity) {
        if (productCount - quantity < 0) {
            throw new ProductOutOfStockException("Product out of stock. Available: " + productCount);
        }
        productCount -= quantity;
        System.out.println("Product sold: " + quantity + ". Remaining stock: " + productCount);
    }

    public void addStock(int quantity) {
        productCount += quantity;
        System.out.println("Stock added: " + quantity + ". Total stock: " + productCount);
    }
}

public class Q_128_StockApp {
    public static void main(String[] args) {
        StockManagement stock = new StockManagement(10);

        stock.sellProduct(3);
        stock.addStock(5);
        stock.sellProduct(8);

        stock.sellProduct(5); 
    }
}
