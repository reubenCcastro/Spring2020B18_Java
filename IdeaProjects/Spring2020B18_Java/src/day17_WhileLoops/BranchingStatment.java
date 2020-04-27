package day17_WhileLoops;

public class BranchingStatment {

    public static void main(String[] args) {

        // System.exit(0): stops the entire program immediately
        for(int i = 0; i <5; i++){
            if(i % 2 !=0){
                //break;exitsthe loop
                //continue;// 0,2,4
                System.exit(0);// 0 will never run
            }
            System.out.println(i);
        }
        System.out.println("Test Complete");

    }
}
