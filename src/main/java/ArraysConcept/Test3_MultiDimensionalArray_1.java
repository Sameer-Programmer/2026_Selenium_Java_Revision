package ArraysConcept;

public class Test3_MultiDimensionalArray_1 {
    static void main(String[] args){
        //Declaration
        int[][] arr ={
                {1,2},
                {3,4},
                {5,6}
        };

        //System.out.println(arr[0][0]+"  "+arr[0][1]);
        int rows_length = arr.length;
        System.out.println(rows_length+"  RowLength");
        int columnsLength = arr[0].length;
        System.out.println(columnsLength+"  ColumnLength");

        for(int i = 0; i<arr.length;i++){
                for (int j =0; j<arr[i].length;j++){
                System.out.println(arr[i][j]+"  ");
                    }
                System.out.println();
        }

        //

        System.out.println("Enhamceforloop");

        /*
        Take the Two Dimensinal Array in a arr Variable then
         First x,y transferrd in a Single Dimensional Array
         Then Print x,y and Then outer Loop contionius
         */
         for(int[] a:arr){
             for(int x:a){
                 System.out.print(x);
             }
            System.out.println();
         }



    }
}
