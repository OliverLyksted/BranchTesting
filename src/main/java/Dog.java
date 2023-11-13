public class Dog extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Vuf Vuf");
    }

    @Override
    public boolean eat(String FoodType) {
        return true;
    }

    @Override
    public void mood(boolean mood) {
        if(mood==true){
            System.out.println("logrer");

        } else {
            System.out.println("knurrer");
        }
    }
}
