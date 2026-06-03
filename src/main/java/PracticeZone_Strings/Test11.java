package PracticeZone_Strings;

public class Test11 {
    static void main(String[] args) {
        String s1 = "I Love India";
        String s2 ="";
        String [] words = s1.split(" ");
        for(String word:words){
         if( word.length() > s2.length()){
             s2 = word;
         }
        }
        System.out.println(s2);
    }
}
