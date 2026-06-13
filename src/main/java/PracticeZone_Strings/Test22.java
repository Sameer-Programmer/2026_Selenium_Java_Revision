package PracticeZone_Strings;

    public class Test22 {

    public static void main(String[] args){

        String s1 = "aaabbccdda";
        String s2 = "";

        char[] arr = s1.toCharArray();
        int count =1;

        for(int i = 0; i<arr.length-1; i++){

            if(arr[i]==arr[i+1]){
                count++;
            }else {
                System.out.println(arr[i]+" "+count);
                count =1;
            }

        }

        System.out.println(arr[arr.length-1]+":"+count);


    }
}