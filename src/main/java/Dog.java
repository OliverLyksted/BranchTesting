public class Dog extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Vuf Vuf");
    }

    @Override
    public boolean eat(String Food) {
        return true;
    }
}
