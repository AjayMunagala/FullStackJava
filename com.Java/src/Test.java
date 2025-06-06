class Address {
    String city;
    String state;
    Address(String city, String state) {
        this.city = city;
        this.state = state;
    }
    void display() {
        System.out.println(city + ", " + state);
    }
}

class Person {
    String name;
    Address address;
    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }
    void display() {//1010
        System.out.println(name);
        address.display();
    }
}

public class Test {
    public static void main(String[] args) {
        Address addr = new Address("New York", "NY");
        Person person = new Person("John Doe", addr);
        person.display();
    }
}