package ExceptionHandlingConcept;

public class Test2 {
    static void main(String[] args) {

        int num1 = 10;

        try {
            int result = num1/0;
        } catch (Exception e) {
            System.out.println("Sorry can handle ");
            System.out.println(e.getMessage());
        }

        System.out.println("Programm Executed");


    }
}
