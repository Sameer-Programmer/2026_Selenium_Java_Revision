package PracticeZone_Strings;

public class Test1_Palindrome {
    static void main(String[] args) {
        String s1 = "MADAM";
        String reverse = "";
        for(int i = s1.length()-1; i>=0; i--){
            char ch = s1.charAt(i);
            reverse = reverse+ch;
        }
        System.out.println(reverse);
    if(s1.equals(reverse)){
        System.out.println("Palindrome");
    }
    }
}
