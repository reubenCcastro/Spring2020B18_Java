package day22_ArraysCont;

public class NestedLoops2 {

    public static void main(String[] args) {

    int [][] numbers = { {9,8,7},{6},{5,4,3,2,1,0} };

    /*
    numbers [0]==> {9,8,7} [0][i] i needs to be repeated 3 times
    numbers [1]===> {6}[1][i] i needs to be repeated 1 times
    numbers [2]===> {5,4,3,2,1,0}[2][i] i needs to be repeated 6 times
     */

    for(int k = 0; k < numbers.length; k++) {


        for (int i = 0; i < numbers[k].length; i++) {
            System.out.print(numbers[k][i]+" ");

        }
        System.out.println();
    }

        //7896012345
        for(int k=0;k<numbers.length;k++){ // k: index arranum
            for(int i = numbers[k].length-1; i>=0;  i--){
                System.out.print(numbers [k][i]+" ");
            }

        }
        System.out.println();
        // numbers = { {9,8,7},{6},{5,4,3,2,1,0} };
            //            0     1           2

        //5432106987

        for (int k = numbers.length-1; k >= 0 ; k--){  //k: index num of 1D arrays (reversed)
            for(int i = 0; i < numbers[k].length; i++ ){// i: index num of elements in 1D array
                System.out.print(numbers [k][i]+" ");

            }
        }
        System.out.println();


        //0123456789
        for (int k = numbers.length-1; k >= 0 ; k--){ //k: index num of 1D arrays (reversed)
            for(int i = numbers[k].length-1;i >=0;  i--){ // i: index num of elements in 1D array (reversed)
                System.out.print(numbers[k][i]+" ");
            }

            }


    }
}
