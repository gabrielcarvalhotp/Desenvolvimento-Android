public class Dog extends Animal {

    public void bark() {
        System.out.println("Au Au");
    }

    public void animalDescription() {
        super.animalDescription();
        System.out.println("Eu sou um cachorro!");
    }
}
