package test2.src;

public class App {
    public static void main(String[] args) throws Exception {


        Car car = new Car();

        System.out.println(car.model);
        car.sound();
        System.out.println(car.handle);
    }
}
