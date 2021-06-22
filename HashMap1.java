import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args){
        HashMap<String, Object> hashMap = new HashMap<String, Object>();

        hashMap.put("101", "사과");
        hashMap.put("Userno", 300);
        hashMap.put("UserId", "iwonjun97");
        hashMap.put("UserName", "김원준");

        System.out.println(hashMap.get("UserName"));
        
        int var = Integer.parseInt(hashMap.get("Userno").toString());
        String str = hashMap.get("101").toString();

        for(String i: hashMap.keySet()){
            
            System.out.println("키 :"+i);
        }

        for(Object i: hashMap.values()){
            System.out.println("값 : "+i);
        }

    }
}
