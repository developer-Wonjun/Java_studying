public class Singleton1 {

    private static Singleton1 singletonObject;

    private Singleton1()
    {

    }

    public static Singleton1 getSingletonobject(){
        if(singletonObject == null){
            singletonObject = new Singleton1();
        }
        return singletonObject;
    }
    
}
