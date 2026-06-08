package StringsConcept;


/*
Substring - startIndex Starts form zero
Substring - endOndex - startIndex+1
 s3.substring(0,5); //  Starting Index and endin Index
 we can provide only Starting Index as well
 s3.substring(6);
Input: "Today is a good day"
Output: "day doog a si Today
 */
public class Basics2 {
    static void main(String[] args){
        String s1 = "Sameer";
        String s2 = s1.substring(0,4); //same
        System.out.println(s2);

        String s3 = "Today is a good day";

        String s4 = s3.substring(0,5); // s4 = Today
        System.out.println(s4);
        System.out.println(s3.indexOf("is"));
        String s5 = s3.substring(6);
        System.out.println(s5);



    }
}
