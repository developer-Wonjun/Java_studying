public class myFunction {

    static void myFunction2(){//static으로 선언을하면 객체생성없이도 함수호출/선언 가능
        //but static은 return값을 가질 수 없음
        System.out.println("함수생성. 매개변수 x");
    }
    int myAdd(int a,int b){
        System.out.println("덧셈함수.");
        int c;
        c= a+b;
        return c;
    }

    static void myAdd(String a, int b){

    }//오버로딩 : 매개변수의 갯수가다르고, 자료형이 다르지만 같은이름의 함수
    public static void main(String[] args) {
    
        myFunction.myFunction2();
        myFunction fc = new myFunction();
        int result = fc.myAdd(10, 5);
        System.out.println(result);
    }
}
