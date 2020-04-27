package day22_ArraysCont;

public class NestedLoops {
    public static void main(String[] args) {


        // int[][] arr2D = { {},{},{} };
        // contain single arrays each index in arr2D MUST be single dimensinal array
        //                   0   1     0   1    2     0    1    2
        char[][] arr2D = {{'A', 'B'}, {'C', 'D', 'E'}, {'F', 'G', 'H'}};
        //                      0          1               2
/*        j  i
            arr2D[0][0]
            arr2D[0][1]
            arr2D[1][0]
            arr2d[1][1]
            arr2d[1][2]
            arr2D[2][0]
            arr2D[2][1]
            arr2D[2][2]
            arr2D[2][3]
         */
        // each index in arr2D MUST be single dimensional array
        //arr2D[0]==> {'A','B'} you can apply regular for loop to this

        for (int i = 0; i < arr2D[0].length; i++) {
            System.out.println(arr2D[0][i]);
        }

        //arr2D[1] ===> {'C', 'D', 'E'}

        for (int i = 0; i < arr2D[1].length; i++) {
            System.out.println(arr2D[1][i]);
        }
        //aar2D [2]=====> {'F', 'G', 'H'}
        for (int i = 0; i < arr2D[2].length; i++) {
            System.out.println(arr2D[2][i]);
        }

        System.out.println("================================");

        for (int j = 0; j < arr2D.length; j++) { //j: index number of 1D array i: index number of elements
            //System.out.println("hello");
            for (int i = 0; i < arr2D[j].length; i++) {
                System.out.println(arr2D[j][i]);

            }


        }
    }
}
