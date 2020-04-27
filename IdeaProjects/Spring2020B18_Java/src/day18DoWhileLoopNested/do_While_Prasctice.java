package day18DoWhileLoopNested;

public class do_While_Prasctice {
  /*
  print all the even numbers 0 - 100 in the same line separated by a space
   */

    public static void main(String[] args) {

        int num = 0;

        do {
            //if(num % 2 == 0){ // for even numbers
            if (num % 2 != 0) { // for odd numbers
                System.out.print(num + " ");
            }

            num++;
        } while (num <= 100);


        System.out.println();

        System.out.print("===================");

        int i = 1;

        do {
            i++;
            System.out.println(i);
        } while (i <= 5);

        System.out.print("===================");

        int z = 1;
        do {
            System.out.println(z);
            if (z == 3) {
                break;
            }
            z++;
        } while (z <= 5);

        System.out.println("===================================");

        int y = 1;

        do {
            if (y == 3) {
                y++;// need to make sure that the iterator is not skipping, son that
                //the condition will eventuly be false
                continue;
            }

            System.out.println(y);

            y++;
        } while (y <= 5);

        System.out.println("=========================");

        int t = 1;

        do {
            if (t % 2 != 0) {
                t++;
                continue;
            }
                System.out.print(t + " ");
                t++;

            }while (t <= 100) ;





    }
}


