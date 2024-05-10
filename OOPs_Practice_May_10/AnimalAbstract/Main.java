package OOPs_Practice_May_10.AnimalAbstract;

public class Main {
    public static void main(String[] args) {
        Animal dog=new Dog("buddy","bwaf");
        Animal cat=new Cat("kitty","meow");
        Animal d1=new Dog("kii","sss");
        dog.sound();
        cat.sound();

        dog.displayAnimalInfo();
        cat.displayAnimalInfo();
        d1.testAnimal();

    }
}
