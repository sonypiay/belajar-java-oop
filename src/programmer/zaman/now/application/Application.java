package programmer.zaman.now.application;

import programmer.zaman.now.data.*;

public class Application {
    public static void main(String[] args) {
        Product product = new Product("Macbook Pro", 30000000);

        System.out.println(product.getPrice());
        System.out.println(product.getName());

        Data data = new Data();
    }
}
