package day09_NestedIf_Ternary;

public class AgeGroups_NestedIf {

    public static void main(String[] args) {

        /*
        write a program that can define the are group of a person age groups are:
        Teenager(<21)
        Adult (>=21 && <55)
        Senior ( > 55)
        age can not be
         */
        int age= 19;
        String group = " ";

        if(age > 0 && age < 150) {

            if (age < 21) {
                group = "Teenager";
            } else if (age < 55){
                group = "Adult";
            } else {
                group = "Senior";
            }

            }else{
                group = "Invalid Entry";
            }
        System.out.println(group);

        System.out.println("==================");

        int age2 =45;
        String group2 = "";

        if(age2 > 0 && age2 <150){

            group2 = (age2 < 21) ? "Teenager" : (age2 < 55) ? "Adult" : "Seniogdr";


        }else{
            group2 = "Invalid Entry";
        }
        System.out.println(group);
        System.out.println(group2);




    }
}
