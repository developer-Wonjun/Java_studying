package Polymorphism.src;

public class App {
    public static void main(String[] args) throws Exception {

        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal owl = new Owl();
        Animal bird = new Bird();

        animal.animalBark();
        dog.animalBark();
        owl.animalBark();
        bird.animalBark();

    }
}
