public class hellow {
    public static void main(String[] args) {

        String[] strs = {"사과","바나나","망고"};
        int[] mm = {1,2,3,4,5,6,7,8};
        int[][] mynum = {{1,2,3,4,5},{5,6,7}};

        for(int i=0; i<mynum.length; i++){
            for(int j=0; j<mynum[i].length; j++){
                System.out.println("i는"+i);
                System.out.println("j는"+j);
                System.out.println(mynum[i][j]);
            }
        }

        for(int z:mm){
            System.out.println(z);
        }
        for(String str:strs){
            System.out.println(str);
        }
    }
}   