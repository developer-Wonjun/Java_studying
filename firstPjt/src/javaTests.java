package firstPjt.src;

public class javaTests {

    private int abc;
    final int aaa = 5;
    public int pblcvar;
    public String str;

    public javaTests(){
        pblcvar = 3+3;
        str = "초기화 되는 값";
    }

    public javaTests(int a, String s){
        pblcvar = a;
        str = s;
    }

    public int getABC() {
        return abc;
    }

    public void setABC(int abc){
        this.abc = abc;
    }
    
}
