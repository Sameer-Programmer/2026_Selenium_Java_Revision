package PracticeZone_Strings;

import org.apache.poi.ss.formula.functions.DCount;

public class Test21 {
    static void main(String[] args) {
        String s1 = "aabbcdde";
        for(int i = 0; i<s1.length(); i++){
            char ch = s1.charAt(i);
            int count = 0;
            for(int j =0 ; j<s1.length(); j++){
                if(s1.charAt(j)==ch){
                   count++;
                }
            }
            if(count==1){
                System.out.println(ch);
                break;
            }
        }


    }
}
