package PracticeZone_Strings;

public class Test13 {
    static void main(String[] args) {
        //Character.isLetter();
        String s1 = "ab12cd";
        char [] arr = s1.toCharArray();
        System.out.println(arr);
        String result = "";//dc12ba

        int left  = 0;
        int right = s1.length()-1;
        while(left<right){
            if(!Character.isLetter(arr[left])){
                left++;
            } else if (!Character.isLetter(arr[right])) {
                right--;
            }else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }


        }
        System.out.println(arr);
    }
}
