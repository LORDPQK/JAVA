package text2;
import text2.StockManager;
import text2.Product;

public class StockDemo {
    public static void main(String[] args) {
        Product coffee = new Product("coffee",1,100);
        Product water = new Product("water",2,20);
        StockManager manager = new StockManager();
        manager.addProduct(coffee);
        manager.addProduct(water);
        manager.printProductDetails();
        manager.findProduct(1);
        manager.numberInStock(1);
        manager.delivery(2,20);
        manager.printLowStockProducts(100);
        manager.findProductByName("water");
    }
}
