

package PracticeZone_Strings;

public class Test15{

    public static void main(String[] args) {
        String s1 = "TestingWorld@1234!";
        String onlyAlphabets = "";
        String onlyNums = "";
        String onlyspecialChars = "";
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);


            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                onlyAlphabets += ch;
            } else if (ch >= '0' && ch <= '9') {
                onlyNums += ch;
            } else {
                onlyspecialChars += ch;
            }
        }


        System.out.println(onlyAlphabets);
        System.out.println(onlyNums);
        System.out.println(onlyspecialChars);

    }
}