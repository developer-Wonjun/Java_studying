package firstPjt.src;

public class App {
    public static void main(String[] args){
        javaTests jvtsts = new javaTests();
        System.out.println("문자열 얻기 "+ jvtsts.str);
        System.out.println("문자열 얻기 "+ jvtsts.pblcvar);

        int var = 0;
        String str = "";

        javaTests jvtsts2 = new javaTests(5, "가나다");
        System.out.println("문자열 얻기" + jvtsts2.str);
        System.out.println("문자열 얻기 "+ jvtsts2.pblcvar);

        jvtsts2.setABC(100);
        System.out.println("문자열 얻기 "+ jvtsts2.getABC());


    }
}
