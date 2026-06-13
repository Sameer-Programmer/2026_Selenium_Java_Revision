package PracticeZone_Strings;

public class Test24_SingleOcc {
    public static void main(String[] args) {

        String s1 = "i love Indiia";
        char ch = 'i';
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == ch) {
                count++;
            }

        }

        System.out.println(count + " :" + ch);

    }
}
