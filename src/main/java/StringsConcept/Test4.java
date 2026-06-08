package StringsConcept;

public class Test4 {
    static void main(String[] args){
        String s1 = "sameeridea7@gmail.com";
        System.out.println(s1.indexOf("idea"));
        String s2 = s1.substring(0,6);
        System.out.println(s2);
        String s3 = s1.substring(6) ;
        System.out.println(s3);
        String s4 = s3.substring(0,5);
        System.out.println(s4);
        String s5 = s3.substring(5);
        System.out.println(s5);
    }
}
