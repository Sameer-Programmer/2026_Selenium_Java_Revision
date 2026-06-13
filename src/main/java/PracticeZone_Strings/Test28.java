
package PracticeZone_Strings;
public class Test28 {
    static void main(String[] args) {
        String s1 ="aab";

        boolean foundB = false;
        boolean result = true;

        for(char ch:s1.toCharArray()){
            if(ch=='b'){
                foundB = true;
            }
            if(foundB && ch=='a'){
                result = false;
                break;
            }
        }

        System.out.println(result);
    }
}
