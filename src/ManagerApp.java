public class ManagerApp {
    public static void main(String[] args) {
        Manager manager = new Manager("Sony");
        manager.sayHello("Budi");

        VicePresident vicePresident = new VicePresident("Budi");
        vicePresident.sayHello("Sony");
    }
}