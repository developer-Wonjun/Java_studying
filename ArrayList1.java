import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args){


        ArrayList<String> arrayList = new ArrayList<String>();
        //ArrayList<Integer> arrayList2 = new ArrayList<Integer>();

        arrayList.add("비둘기");
        arrayList.add("오리");
        arrayList.add("꿩");
        arrayList.add("부엉이");

        System.out.println(arrayList.get(3));
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(arrayList.size()-1));

        arrayList.set(0, "독수리");
        System.out.println(arrayList.get(0));

        List list;
        list = arrayList;

        arrayList.remove(0);


        Collections.sort(arrayList);
        for(int i=0; i<arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
    }
    
}
