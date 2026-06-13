package PracticeZone_Strings;

public class Test30 {
    static void main(String[] args) {


        String s1 = "658488";
        String result = ""; //Output: “><>=<”

        for(int i =0; i<s1.length()-1; i++){

            char currentCharacter = s1.charAt(i);
            char nextCharacter = s1.charAt(i+1);

            if(currentCharacter>nextCharacter){
                result = result+">";
            }else if (currentCharacter<nextCharacter){
                result = result+"<";
            }else if(currentCharacter==nextCharacter){
                result = result+"=";
            }
        }
        System.out.println(s1);
        System.out.println(result);


    }
}
