package OOPs_Practice_May_10.AnimalAbstract;

abstract class Animal {
    private String name;
    public String sound;

    public Animal(String name,String sound){
        this.name=name;
        this.sound=sound;
    }

    public String getSound(){
        return sound;
    }

    public abstract void sound();

    public void displayAnimalInfo(){
        System.out.println("The name of the animal is: "+name);
    }

    public void testAnimal(){
        System.out.println("By this we accessing the animal method with out creating the object of it");
    }
}
