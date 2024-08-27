public class PersonApp {
    public static void main(String[] args) {
        Person person1 = new Person("Sony", "Darmawan");

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Budi");
    }
}
