package programmer.zaman.now.data;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Macbook Pro", 3000000);

        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println(product);
    }
}
