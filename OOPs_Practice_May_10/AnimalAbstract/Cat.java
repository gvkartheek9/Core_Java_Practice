package OOPs_Practice_May_10.AnimalAbstract;

public class Cat extends Animal{

    public Cat(String name,String sound){
        super(name,sound);
    }

    @Override
    public void sound() {
        System.out.println("The dog sounds like "+getSound());
    }

    @Override
    public void displayAnimalInfo() {
        super.displayAnimalInfo();
        System.out.println("that is the dog one");
    }
}
