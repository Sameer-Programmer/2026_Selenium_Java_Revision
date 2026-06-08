package StringsConcept;

public class Test5 {
    static void main(String[] args){
        String s1 = "sameer,idea7@gmail.com";
        String[] s3 = s1.split(",");
        System.out.println(s3[0]);
        System.out.println(s3[1]);
        String[] s4 = s3[1].split("@");
        System.out.println(s3[0]);
        System.out.println(s4[0]);
        System.out.println(s4[1]);



    }
}
