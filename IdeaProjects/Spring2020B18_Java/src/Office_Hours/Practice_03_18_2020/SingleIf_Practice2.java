package Office_Hours.Practice_03_18_2020;

public class SingleIf_Practice2 {

    public static void main(String[] args) {
        byte age = 20;
        boolean eligibleToBuy = age > 21 || age ==21; //or age >=21;

         if(age>=21){
            System.out.println("You're eligible to buy alcohol");
        }
         if(age < 21){
             System.out.println(" Go drink your milk");
         }
        boolean feelingHappy = false;

        if(feelingHappy == false){
            System.out.println("don't be sad");
        }

        if(feelingHappy == true){
            System.out.println("Stay happy");
        }



    }

}
