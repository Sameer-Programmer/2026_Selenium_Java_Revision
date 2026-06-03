package Collections;

import java.util.ArrayList;

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

        int arrayListSize = arrayList.size();
        System.out.println(arrayListSize);
        System.out.println(arrayList);
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.getLast());
        System.out.println(arrayList.isEmpty());

    }
}
