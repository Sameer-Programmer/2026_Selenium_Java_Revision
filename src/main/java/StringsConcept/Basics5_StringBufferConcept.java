package StringsConcept;

public class Basics5 {
    static void main(String[] args) {
/*
StringBuffer sbf;              // Declaration only
StringBuffer sbf = new StringBuffer(); // Empty object creation
StringBuffer sbf = new StringBuffer("Welcome"); // Object with initial value
 */
StringBuffer sbf = new StringBuffer("Welcome");
        System.out.println(sbf);
        StringBuffer  reverse = sbf.reverse();
        System.out.println(reverse);

        StringBuffer sbf2 = new StringBuffer("Sameer     ");
        sbf2.append("Bhai");
        System.out.println(sbf2);


    }
}
