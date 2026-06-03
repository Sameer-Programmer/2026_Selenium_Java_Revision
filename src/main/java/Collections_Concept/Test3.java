package Collections_Concept;
/*
import java.util.HashMap;
HashMap
- Data Can be stored in the form of Key Value pairs
-- Key May be Unique Value may be Duplicate
-- insertion Order not preserved
 */


import java.util.HashMap;

public class Test3 {
    static void main(String[] args) {
        HashMap hm = new HashMap<>();
        hm.put(1,1);
        hm.put(2,10.5);
        hm.put(3,'A');
        hm.put(4,"Welcome");
        hm.put(5,true);
        hm.put(6,null);
        System.out.println(hm);

        hm.remove(6);
        System.out.println(hm);
        System.out.println(hm.get(4));
        System.out.println(hm.keySet());
        System.out.println(hm.values());
        System.out.println(hm.entrySet());

        for(Object k :hm.keySet()){
            System.out.println(k +" :"+hm.get(k));
        }
    }
}
