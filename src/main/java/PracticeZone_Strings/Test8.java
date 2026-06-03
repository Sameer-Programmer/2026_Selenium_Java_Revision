package PracticeZone_Strings;

import java.util.Arrays;

public class Test8 {
    static void main(String[] args) {
        // Anagram check
        String s1 = "silent";
        String s2 = "listen";

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);

        if(Arrays.equals(c1,c2)){
            System.out.println("Anagram");
        }else {
            System.out.println("not Ana");
        }

    }
}
