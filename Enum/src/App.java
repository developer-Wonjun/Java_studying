package Enum.src;

public class App {

    public enum Type{
        A1000,A1001,A1002,A1003
    }
    public static void main(String[] args) throws Exception {

        Type cType = Type.A1000;

        switch(cType){
            case A1000:
                System.out.println("1000모델사용");
                break;
            case A1001:
                System.out.println("1001모델사용");
                break;
            case A1002:
                System.out.println("1002모델사용");
                break;
            case A1003:
                System.out.println("1003모델사용");
                break;

        }

        System.out.println(cType.ordinal());
    }
}
