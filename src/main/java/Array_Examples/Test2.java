package Array_Examples;

public class Test2 {
    static void main(String[] args) {
        // Two Dimensional Array
        int[][] nums = {{1, 2}, {3, 4}};
        int rowsLength = nums.length;
        int columnsLength = nums[0].length;
        System.out.println(rowsLength);
        System.out.println(columnsLength);

        for(int i = 0 ; i<rowsLength; i++){
            for(int j =0; j<columnsLength;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }

    }
}
