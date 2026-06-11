package PracticeZone_Strings;

import java.util.HashMap;

public class Test20 {
    static void main(String[] args) {
        String s1 = "Sameer Bhai";
        char [] arr = s1.toCharArray();
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char c :arr){
            if(String.valueOf(c).isBlank()){
                continue;
            }
            if(hm.containsKey(c)){
                hm.put(c,hm.get(c)+1);
            }else{
                hm.put(c,1);
            }
        }


        for(char c : hm.keySet()){
            System.out.println(c+": "+ hm.get(c));
        }




    }
}
