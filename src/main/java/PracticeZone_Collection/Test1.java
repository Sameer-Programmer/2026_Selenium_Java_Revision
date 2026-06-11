package PracticeZone_Collection;

import java.util.HashMap;

public class Test1 {
public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"sameer");
        map.put(2,"Imran ");
        System.out.println(map);

        for(Object key :map.keySet()){
            System.out.println(key+":"+map.get(key));
        }
    }
}
