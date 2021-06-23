package Thread1.src;

public class Sound implements Runnable {

    @Override
    public void run() { //스레드 발동시 호출 될 함수
        for(int i=0; i<5; i++){
            
            System.out.println("소리를 냅니다.");
            try {
                Thread.sleep(300);
            } catch (Exception e) {
            } //1000이 1초
        }
    }
    
}
