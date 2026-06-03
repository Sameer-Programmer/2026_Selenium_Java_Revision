package PracticeZone_Strings;

/*
Reverse a character in the string
let input = 'I love India'
let result = ""//aidnI evol I
 */

public class Test7 {
    static void main(String[] args) {
        String s1 = "I love India";
        String result ="";
        String [] s2 = s1.split(" ") ;
        String [] words = new String[s2.length] ;
        int index = 0;
        for(int i = s2.length-1; i>=0;i--){
            words[index] = s2[i];
            index++;
        }

        for(String word:words){
            System.out.println(word);

            for(int i = word.length()-1; i>=0;i--){
                result = result+word.charAt(i);
            }
            result = result + " ";
        }
        System.out.println(result);
    }
}
