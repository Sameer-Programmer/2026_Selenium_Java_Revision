package Execrcise_Zone;
import java.util.*;
public class  Test1 {
    public static void main(String[] args){
        //Reverse a String
        String s1 = "sameer123@!#";
        String onlyAlphabets = "";
        String onlynums ="";
        String onlyspec ="";
        for(int i = s1.length()-1; i>=0; i--){
            char ch = s1.charAt(i);

            if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')){
                onlyAlphabets +=ch;
            }else if(ch>='0' && ch<='9'){
                onlynums+=ch;
            } else {
                onlyspec+=ch;
            }
        }
        System.out.println(onlyAlphabets);
        System.out.println(onlynums);
        System.out.println(onlyspec);

    }
}