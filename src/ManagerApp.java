public class ManagerApp {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.name = "Sony";
        manager.sayHello("Budi");

        VicePresident vicePresident = new VicePresident();
        vicePresident.name = "Budi";
        vicePresident.sayHello("Sony");
    }
}