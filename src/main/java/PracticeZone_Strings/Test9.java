package PracticeZone_Strings;

public class Test9 {
    static void main(String[] args) {
          String s1 = "proGRamming";
String s2 = s1.toLowerCase();
        System.out.println(s2);
          int vowelsCount = 0;
          int consonantsCount = 0;
          String v = "";
          String c = "";

          for(int i = 0; i<s1.length();i++){
            char ch = s2.charAt(i);

                if(ch == 'a' || ch =='e' || ch =='i' || ch =='o' || ch == 'u'){
                    vowelsCount = vowelsCount +1;
                    v = v+ch;
                }else {
                    consonantsCount ++;
                    c = c+ch;
                }
            }




        System.out.println(vowelsCount);
        System.out.println(consonantsCount);
        System.out.println(v);
        System.out.println(c);
    }
}
