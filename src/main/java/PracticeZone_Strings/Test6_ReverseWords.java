package PracticeZone_Strings;

public class Test6_ReverseWords {
    static void main(String[] args) {
        String s1 = "I Love India";
        String s2 = ""; // I evol aidnI;

        String [] words = s1.split(" ");
        System.out.println(words.length);
        for(String word :words){
            for(int i =word.length()-1; i>=0; i--){
               s2 = s2+word.charAt(i);
            }
            s2= s2+" ";
        }
        System.out.println(s2);


    }
}
