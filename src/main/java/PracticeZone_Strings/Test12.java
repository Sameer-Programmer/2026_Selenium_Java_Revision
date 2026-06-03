package PracticeZone_Strings;

public class Test12 {
    static void main(String[] args) {
        // Remove Spaces
        String s1 = "I Love India";
        String s2 = "";
        String [] words = s1.split(" ");
        System.out.println(words.length);
        for(String word:words){
           s2 = s2+word;
        }
        System.out.println(s2);

    }
}
