package PracticeZone_Strings;

public class Test31 {
    static void main(String[] args) {

        String s1 = "Today is a good day";
        String [] words = s1.split(" ");

        String result = ""; // day doog a si Today

        for(int i =words.length-1; i>=0; i-- ){
            if(i==0||i== words.length-1){
                result = result + words[i]+" ";
            }else{
                StringBuffer sb = new StringBuffer(words[i]);
                result = result+sb.reverse()+" ";
            }
        }

        System.out.println(result);




    }
}
