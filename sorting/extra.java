import java.util.HashMap;

public class extra {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"tejas");
        map.put(2,"sakshi");
        map.put(3,"om");
        map.containsKey(1);
        for(Integer key : map.keySet()){
            System.out.println(map.get(key));
        }
        System.out.println(map.containsKey(1));
    }
}
