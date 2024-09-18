class Manager extends Employee {
    Manager(String name) {
        super(name);
    }

    void sayHello(String name) {
        System.out.println("Hi " + name + ", I am your Manager. My name is " + this.name);
    }
}