package ExceptionHandlingConcept;

public class Test3 {
    static void main(String[] args) {


        try {
            int num [] = {1,2,3};
            System.out.println(num[3]);
        } catch (Exception e) {
            System.out.println("Excption occured Mama");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("programm finished");
        }






    }
}
