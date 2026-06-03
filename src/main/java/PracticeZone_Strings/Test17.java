package PracticeZone_Strings;

import java.util.Arrays;

public class Test17 {
    public static void main(String[] args){

        String s1 = "Sameer";
        char [] arr = s1.toCharArray();
        System.out.println(arr); // this is characer array Right Prnting like strings
        System.out.println(Arrays.toString(arr));
        char ch = s1.charAt(1) ;// to print a
        System.out.println(ch);
        System.out.println(s1.length());
        System.out.println(s1.replace('r','d'));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1);
        System.out.println(s1.trim());
        System.out.println(s1.length());
        System.out.println(s1.substring(1));
        System.out.println(s1.substring(0,3));



    }
}