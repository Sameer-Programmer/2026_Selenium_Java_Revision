package PracticeZone_Strings;

public class Test16 {
    static void main(String[] args) {
        String s1 = "Shaik Mohamed Sameer";
        String[] words = s1.split(" ");
        String middle = words[1];
        String reverse = "";
            for(int j = middle.length()-1; j>=0; j--) {
                reverse = reverse + middle.charAt(j);
            }
        System.out.println(words[0]+" "+reverse+" "+words[2]);
    }
}
