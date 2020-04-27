package day21_MultiDimensionalArrays;

public class Emails {
    /*
    Task:
        given an array:
            String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com",
             "Cybertek@hotmail.com", "Cybertek@outlook.com"}
            elements could be more in the array
        print out all the email addresses excluding the gmail address
            NOTE: MUST USE FOR EACH LOOP

     */
    public static void main(String[] args) {

        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com",
                "Cybertek@hotmail.com", "Cybertek@outlook.com"};

        for (String eachEmail : emails) {
            if(eachEmail.endsWith("@gmail.com")){
                continue;

/*
            if (!eachEmail.endsWith("@gmail.com")) {
                System.out.println(eachEmail);

 */

            }
            System.out.println(eachEmail);


        }
    }
}










