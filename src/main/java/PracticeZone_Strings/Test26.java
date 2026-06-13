package PracticeZone_Strings;

public class Test26 {
    static void main(String[] args) {
       String s1 = "Shaik Mohamed Sameer";
       // outut is  "Shaik demahoM Sameer"
       String [] arr = s1.split(" ");
        String middle = arr[1];
        String reverse = "";
           for(int j = middle.length()-1; j>=0;j--){
               reverse = reverse+middle.charAt(j);
           }
        System.out.println(arr[0]);
           System.out.println(reverse);
        System.out.println(arr[2]);





    }
}
