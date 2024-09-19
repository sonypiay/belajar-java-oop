package programmer.zaman.now.data;

public class Product {
    protected String name;
    protected int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

   public String getName() {
        return this.name;
   }

   public int getPrice() {
        return this.price;
   }

   public String toString() {
        return "Product name: " + this.name + ", price: " + this.price;
   }
}
