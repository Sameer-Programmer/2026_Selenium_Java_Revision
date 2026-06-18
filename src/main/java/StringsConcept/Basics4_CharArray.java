package StringsConcept;

public class Basics4_CharArray {
    static void main(String[] args){
        String s1 = "School";
        char [] arr = s1.toCharArray();

        for(char value:arr){
            System.out.println(value);
        }

        for(int i = arr.length-1; i>=0; i--){
            //System.out.println(arr[i]);
        }

    }
}
