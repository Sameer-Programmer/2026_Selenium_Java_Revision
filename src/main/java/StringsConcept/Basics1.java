package StringsConcept;

public class Test1 {
    static void main(String[] args){
        // String is a Predeined Class
        // Declaration
        // Length
        // concatination - + or concat()
        // trim()
        //charAt()
        // contains -- sequence of string is Impotant
        // ==
        // equals()
        // replace('given','expected') // singlr
        // replace("given","expected") // Multiple
        String str = "Hi Sameer";
        String str2 = new String("Imran");
        System.out.println(str.length());
        String s3 = str.concat(str2);
        System.out.println(s3);
        System.out.println(str+str2);
        System.out.println(str.concat("Peera  "));
        String s4 = str.concat("Shaik    ");
        System.out.println(s4.trim());

        String s1 = "Sameer";
        System.out.println(s1.charAt(0));
        System.out.println(s1.contains("r"));

        String data1 = "Sameer";
        String data2 = "SAMEER";
        System.out.println(data1==data2); // Compares either the both variables points to same Object
        System.out.println(data1.equals(data2));//Compares the content/value of object
        System.out.println(data1.equalsIgnoreCase(data2));

    }
}
