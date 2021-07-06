package ProjectOOP;

class Foo{
    public static String classVar = "I class var";
    public String instanceVar = "I instance var";
    public static void classMethod() {
        System.out.println(classVar); // Ok
//      System.out.println(instanceVar); // Error
    }
    public void instanceMethod() {
        System.out.println(classVar); // Ok
        System.out.println(instanceVar); // Ok
    }
}
public class StaticApp {
 
    public static void main(String[] args) {
//        System.out.println(Foo.classVar); // OK
//        System.out.println(Foo.instanceVar); // Error
//        Foo.classMethod();
//        Foo.instanceMethod();
         
        Foo f1 = new Foo();
        Foo f2 = new Foo();
      
        System.out.println(f1.classVar); // I class var
        System.out.println(f1.instanceVar); // I instance var
      
        f1.classVar = "인스턴스가 static변수를 바꾸면 해당 변수 자체가 변경 되는구나~";
        System.out.println(Foo.classVar); // changed by f1
        System.out.println(f1.classVar);
        System.out.println(f2.classVar);  // changed by f1
      
        f1.instanceVar = "인스턴스가 no static변수를 변경하면 그 인스턴스에 대한 변수만 바뀌는 구나 ~";
        System.out.println(f1.instanceVar); // changed by f1
        System.out.println(f2.instanceVar); // I instance var
    }
 
}
    