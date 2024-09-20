package programmer.zaman.now.data;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;
        return price == product.price && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + price;
        return result;
    }
}
