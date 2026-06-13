package Execrcise_Zone;

import java.util.*;
public class  Test2 {
    public static void main(String[] args){

        //Reverse a String
        String s = "abcdabcdaaa";
        HashSet<Character>set = new HashSet<>();
        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            set.add(ch);
        }
        System.out.println(set);

        for(Object k :set){
            System.out.println(k);
        }
    }
}