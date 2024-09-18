class VicePresident extends Manager {
    VicePresident(String name) {
        super(name);
    }

    void sayHello(String name) {
        System.out.println("Hi " + name + ", I am Vice President. My name is " + this.name);
    }
}