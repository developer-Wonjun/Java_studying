import java.util.Scanner;

public class mytry {

    public static void main(String[] args) {

        try{
            int i =0;
            System.out.println("값을 입력해주세요.");
            Scanner instr = new Scanner(System.in);
            i = instr.nextInt(); // 스캐너로부터 다음의 값을 받음.

            int[] numbers = {1,2,3,4,5};
            System.out.println(numbers[i]);
        }
        catch(Exception e){
            System.out.println("*****오류가 발생하였습니다.*****");
            System.out.println("오류내용 :" + e.getMessage());
            throw e;
        }
        finally{
            System.out.println("이코드는 무조건 실행됨");
        }

    }
}
