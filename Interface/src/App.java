package Interface.src;

public class App {
    public static void main(String[] args) throws Exception {
    
        X50 x50 = new X50();

        System.out.println("주행거리"+x50.start());

        x50.stop();
        x50.honk();
    
    }
}

