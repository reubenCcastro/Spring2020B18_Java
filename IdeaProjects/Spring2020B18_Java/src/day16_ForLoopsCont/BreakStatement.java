package day16_ForLoopsCont;

public class BreakStatement {
/*
this is a good example to show that java works from top to down.
 if we write sout before “if statement” it will be written three
 imes, if we write after “if statement” i will be written 2 times.
 */
    public static void main(String[] args) {

        for(int i = 1; i <= 5;i++) {

            System.out.println("Hello World");

            if (i == 3) {
                break;
            }
        }
            for(char i = 'a'; i <= 'z'; i++){

                if(i == 'e'){
                    break;
                }

                System.out.println(i);



        }
    }
}
