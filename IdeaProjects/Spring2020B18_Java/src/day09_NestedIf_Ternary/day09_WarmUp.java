package day09_NestedIf_Ternary;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class day09_WarmUp {

    /*


                    baby (< 1 year)
                    Toddler (3 - 5),
                    Kid (6 - 9),
                    Pre-Teen (10 - 12),
                    Teenager (13 - 17),
                    Young Adult (18 - 20),
                    Adult (21 - 39),
                    Young Middle-Aged Adult (40 - 49),
                    Middle-Aged Adult (50 - 54),
                    Very Young Senior Citizen (55 - 64),
                    Young Senior Citizen (65 - 74),
                    Senior Citizen (75 - 84),
                    Old Senior Citizen (85+)
     */
    public static void main(String[] args) {

        int age = 26;
        String group = " ";


        if (age >= 0 && age < 3) {
            group = "infant";
        } else if (age >= 3 && age <= 5) {
            group = "Toddler";
        } else if (age >= 6 && age <= 9) {
            group = "Kid";
        } else if (age >= 10 && age <= 12) {
            group = "Pre-teen";
        } else if (age >= 13 && age <= 17) {
            group = "Teenager";
        } else if (age >= 18 && age <= 20) {
            group = "Young Adult";
        } else if (age >= 21 && age <= 39) {
            group = "Adult";
        } else if (age >= 40 && age <= 49) {
            group = "Young Middle-Aged Adult";
        } else if (age >= 50 && age <= 54) {
            group = "Middle_Aged-Adult";
        } else if (age >= 55 && age <= 64) {
            group = "Very Young Senior Citizen";
        } else if (age >= 65 && age <= 74) {
            group = "Senior Citizen";
        } else if (age >= 85 && age <= 150){
            group = "Old Senior Citizen";
        } else {
            group = "invalid age";

        }
        System.out.println(group);

        boolean eligibleToBuy = group == "Adult" || group == "Young Middle-Aged Adult" || group == "Middle_Aged-Adult";
         if(eligibleToBuy){
             System.out.println("You are eligible");
         }
         else{
             System.out.println("You are not eligible");
         }
    }
}