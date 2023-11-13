public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound();
        cat.makeSound();

        cat.eat("fisk");
        dog.eat("DogFood");

        cat.mood(true);
        dog.mood(false);


    }
}
