public class Cat extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Miaw Miaw");
    }

    @Override
    public boolean eat(String Food) {
        return false;
    }
}
