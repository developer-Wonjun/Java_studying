package Interface.src;

public class X50 implements Car, Vehicle {

    private int total = 500;

    @Override
    public void honk() {
        System.out.println("경적 빵빵");
        this.stop();
    }

    @Override
    public int start() {
        return this.total;
    }

    @Override
    public void stop() {
        System.out.println("정지했습니다.");
    }

    
}
