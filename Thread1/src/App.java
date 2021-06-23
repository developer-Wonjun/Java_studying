package Thread1.src;

public class App {
    public static void main(String[] args) throws Exception {

        Sound sound = new Sound();
        Thread thread = new Thread(sound);
        //runable이기에 매개변수 줄 수 있다.
        thread.start();

        for(int i=0; i<5; i++){
            try{
                System.out.println("메인프로그램 출력");
                Thread.sleep(500);
            }
            catch(Exception e){
                System.out.println("오류발생 오류발생");
            }
        }
    }
}
