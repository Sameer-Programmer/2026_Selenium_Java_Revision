package PracticeZone_Strings;

public class Test10 {
    static void main(String[] args) {
        //Capitalize the frst Letter in the word
        String s1 = "i love india";
        String result = "";
        String [] words = s1.split(" ");
        for(String word :words){
            result = result+word.substring(0,1).toUpperCase()+word.substring(1)+" ";
            System.out.println(result);
           }



    }
}
