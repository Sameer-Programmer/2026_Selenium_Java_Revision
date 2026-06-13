package PracticeZone_Strings;

public class Test29 {
    static void main(String[] args) {
        String s1 ="aaccccdddb";
        boolean foundB = false;
        boolean result = true;
        for(int i =0; i<s1.length();i++){
            char ch = s1.charAt(i);

            if(ch == 'b'){
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
