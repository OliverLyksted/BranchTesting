public class Cat extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Miaw Miaw");
    }

    @Override
    public boolean eat(String FoodType) {
        return true;
    }

    @Override
    public void mood(boolean mood) {
        if (mood== true){
            System.out.println("spinder");
        } else {
            System.out.println("hvæser");
        }
    }
}
