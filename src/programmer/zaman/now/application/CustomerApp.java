package programmer.zaman.now.application;

import programmer.zaman.now.data.Customer;
import programmer.zaman.now.data.Level;

public class CustomerApp {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.setName("Sony");
        customer1.setLevel(Level.PREMIUM);

        System.out.println(customer1.getName());
        System.out.println(customer1.getLevel().getDescription());

        String levelName = Level.VIP.name();
        System.out.println(levelName);

        Level level = Level.valueOf("PREMIUM");
        System.out.println(level);
    }
}
