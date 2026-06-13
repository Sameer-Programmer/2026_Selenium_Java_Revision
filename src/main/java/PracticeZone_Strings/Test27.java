package PracticeZone_Strings;

public class Test27 {
    static void main(String[] args) {
        String s1 = "Today is a good day";
        String result = "";//""day doog a si Today";
String [] arr = s1.split(" ");
        for(int i = arr.length-1; i>=0; i--){

            if(i==0 || i==arr.length-1){
                result = result+arr[i]+" ";
            }else {
                StringBuffer sbf = new StringBuffer(arr[i]);
                result = result+sbf.reverse()+" ";
            }


        }

        System.out.println(result);
    }
}
