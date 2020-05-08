package day35_Static;
/*create a class called MyOffers
        Create 5 offer objects, and add them into the list of offers, and then:
            1. use for loop to print out the info of each offer
            2. write a program that can only retain the offers if:
                    1. the offer is for fulltime position
                    2. offer is from your local area
                    3. salary is greater than 100K
*/
import java.util.ArrayList;
import java.util.Arrays;

public class MyOffersObjects {

    public static void main(String[] args) {

        //when ever you pass object. it will do the toString method if you do have it will give you a hashcode.
        Offer offer1 = new Offer();
        offer1.setofferInfo("San Jose, Ca", "Cisco", 85000,true);

        Offer offer2 = new Offer();
        offer2.setofferInfo("TX", "Peraton", 120000, true);

        Offer offer3 =  new Offer();
        offer3.setofferInfo("Bangalore, IN", "Fire Eye", 80000,false );

        Offer offer4 = new Offer();
        offer4.setofferInfo("Seattle, WA", "Fred Hutch", 156000, true);

        Offer offer5 =  new Offer();
        offer5.setofferInfo("Burlington, MA", "HealthEdge", 72000, true);

        Offer[] offers = {offer1,offer2,offer3,offer4,offer5};

        String myLocation = "TX";

        ArrayList<Offer> jobOffers = new ArrayList<>(Arrays.asList(offers));
        //jobOffers.addAll(Arrays.asList(offer1,offer2,offer3,offer4,offer5));if you use an arr use the top two

        //jobOffers.removeIf(p-> p.Salary < 100000 || p.IsfullTime == false || !p.Location.equals(myLocation));// we remove the offer if its less than 100K or full time
        jobOffers.removeIf(p->p.Salary < 100000);
        jobOffers.removeIf(p->p.IsfullTime == false);
        jobOffers.removeIf(p->!p.Location.equals(myLocation));

        System.out.println(jobOffers.size());
        for(Offer eachOffer: jobOffers){
            System.out.println(eachOffer);
            /*
            for(int i = 0; i < jobOffers.size(); i++){
           // Offer eachOffer = jobOffers.get(i);
            //System.out.println(eachOffer);

        }
        System.out.println("==============================================================================");
        jobOffers.removeIf(p -> !p.IsfullTime );
       for(int i = 0; i < jobOffers.size(); i++) {
            Offer eachOffer = jobOffers.get(i);
            System.out.println(eachOffer);
        }
        System.out.println("================================================================================");
        jobOffers.removeIf(p -> p.Salary < 100000);
        for(int i = 0; i < jobOffers.size(); i++) {
            Offer eachOffer = jobOffers.get(i);
            System.out.println(eachOffer);
        }
        System.out.println("==================================================================================");
        jobOffers.removeIf(p->!p.Location.contains("TX"));
        for(int i = 0; i < jobOffers.size(); i++) {
            Offer eachOffer = jobOffers.get(i);
            System.out.println(eachOffer);

             */
        }

    }
}
