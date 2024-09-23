package demo;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println("woof woof");
    }

    public void fetch() {
        System.out.println(name + " is fetching the ball");
    }
}





