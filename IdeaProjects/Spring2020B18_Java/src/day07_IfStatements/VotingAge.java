package day07_IfStatements;

public class VotingAge {
    public static void main(String[] args) {
        /*
4. write a java program that can identify if a person is eligible to vote for Donald Trump
    Note : use single if statements Collapse
     */

        int age = 17;
        boolean UScitizen = true;

        boolean eligible = age >= 18 && UScitizen == true;

        if(eligible == true){
            System.out.println("You are eligible to vote");
        }

        if(eligible != true){
            System.out.println("You are not eligible to vote");
            }



    }
}
