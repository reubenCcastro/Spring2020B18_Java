package day09_NestedIf_Ternary;

public class Ternary2 {

    public static void main(String[] args) {

        // ternary: ?  mean if, : else
        String result = " ";
        if(9 > 10){
            result= "9 is greater";
        }else{
            result = "10 is greater";
        }
        String result2 = (9 > 10) ? "9 is greater" : "10 is greater";
        System.out.println(result);
        System.out.println(result2);


        System.out.println("========================");

        int age = 21;
        boolean eligibilty = (age >= 21)? true : false;
        /*
        if (age>=21){
            eligibilty = true;
        }else{
            eligibilty = false;

         */
        System.out.println(eligibilty);

        System.out.println("============");

        int ageOfPerson =20;
        String eligibleToVote = "Yes";
        if(ageOfPerson >= 18){
            eligibleToVote = "Yes";
        } else{
            eligibleToVote = "No";

            String eligibleToVote2 = (ageOfPerson >= 18) ? "Yes" : "No";
            System.out.println("eligibiltyToVote");
            System.out.println("eligibiltyToVote2");



        }

    }

}
