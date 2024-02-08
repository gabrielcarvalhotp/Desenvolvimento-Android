//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Bruce");
        dog.setSize(70);
        dog.setColor("Black");
        dog.animalDescription();
        dog.bark();
        dog.run();
        dog.stop();

        System.out.println();

        Bird bird = new Bird();
        bird.setName("Frederico");
        bird.setColor("Azul");
        bird.setSize(15);
        bird.animalDescription();
        bird.chirp();
        bird.run();
        bird.stop();
    }
}