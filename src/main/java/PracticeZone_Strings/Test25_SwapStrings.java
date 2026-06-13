package PracticeZone_Strings;

public class Test25_SwapStrings {
    static void main(String[] args) {
        String s1 = "Sameer";
        String s2 = "Imran";
        String s3 = s1+s2; //SameerImran

s2 = s3.substring(0,s1.length());
        System.out.println(s2);
        System.out.println(s3.indexOf("Imran"));
        s1= s3.substring(6);
        System.out.println(s1);





    }


}


