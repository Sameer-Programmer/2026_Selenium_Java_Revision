package Collections_Concept;

import java.util.ArrayList;


/*
ArrayList is a class
- Allow Heterogenious Data
- All duplicates
- dynamically Growing
- Insertion is Preserved
- All Multiple Null Values
 */

public class Test1 {
    static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add("Sameer");
        arrayList.add('A');
        arrayList.add(true);
        arrayList.add(120.60);
        arrayList.add(0,"Imran");
        arrayList.set(0,"Hafiza"); // replace
        arrayList.remove(0);
        arrayList.add("Python");
        arrayList.add("JavaScript");

        int arrayListSize = arrayList.size();
        System.out.println(arrayListSize);
        System.out.println(arrayList);
        System.out.println(arrayList.get(0));
      //  arrayList.getLast();
      // System.out.println(arrayList.getLast());
        System.out.println(arrayList.isEmpty());

        ArrayList arrayList2 = new ArrayList();

        arrayList2.add("Python");
        arrayList2.add("JavaScript");

        System.out.println(arrayList);
        arrayList.removeAll(arrayList2);
        System.out.println(arrayList);


        for(int i  =0 ; i<arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }

    }
}


/*
To Remove the Multiple elements from one array List We have create one new array List
add which one you want to remove and then remove frm Main array List
removeall()
 */

