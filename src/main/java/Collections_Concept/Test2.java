package Collections_Concept;
/*
HashConcept
- Heterogenious Data Allowed
- Inserion is Not Preserved no indexing concept
- Duplicates Are not allowed
- Multiple Nulls Not allowed


NOTE -- to access through index we have add set to arraylist

 */

import java.util.ArrayList;
import java.util.HashSet;

public class Test2 {
    static void main(String[] args) {



        HashSet set = new HashSet<>();

        set.add(1);
        set.add(100.60);
        set.add('A');
        set.add("Welcome");
        set.add(true);
        set.add("Welcome");
        System.out.println(set);
        set.remove(1); // Not index valie given
        System.out.println(set);
        set.remove("Welcome");
        System.out.println(set);

        System.out.println(set.size());


        ArrayList arrayList = new ArrayList(set);
        System.out.println(arrayList.get(0));

    }
}
