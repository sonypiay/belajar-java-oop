public class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Eko");
        employee.sayHello("Budi");

        employee = new Manager("Eko");
        employee.sayHello("Budi");

        employee = new VicePresident("Eko");
        employee.sayHello("Budi");

        sayHello(new Employee("Eko"));
        sayHello(new Manager("Eko"));
        sayHello(new VicePresident("Eko"));
    }

    static void sayHello(Employee employee) {
        if( employee instanceof VicePresident ) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello " + vicePresident.name);
        } else if( employee instanceof Manager ) {
            Manager manager = (Manager) employee;
            System.out.println("Hello " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    }
}
