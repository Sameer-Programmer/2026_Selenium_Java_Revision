package PracticeZone_Strings;

public class Test2 {
    static void main(String[] args) {
       // Seperate Character, number , Special character and count
        String s1 = "TestingWorld@1234!";
        String onlyNums = "";
        String onlyAlphabets = "";
        String onlySpecial ="";

        for(int i = 0; i<s1.length(); i++){
            char ch = s1.charAt(i);
            if((ch>='A' && ch<='Z')||(ch>='a'&&ch<='z')){
                onlyAlphabets = onlyAlphabets +ch;
            } else if (ch>='0' && ch<='9') {
                onlyNums = onlyNums+ch;
            }else {
                onlySpecial = onlySpecial+ch;
            }
        }
        System.out.println(onlyAlphabets);
        System.out.println(onlyNums);
        System.out.println(onlySpecial);

    }
}
