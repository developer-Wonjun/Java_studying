package test2.src;


//자식클래스, 하위클래스
public class Car extends Vehicle{

    public String handle = "자동차 핸들";

    public void run(){
        System.out.println("달립니다.");
    }


    //오버라이딩
    public void sound(){
    System.out.println("경적을 울렸습니다."+handle);
    }
    
}
