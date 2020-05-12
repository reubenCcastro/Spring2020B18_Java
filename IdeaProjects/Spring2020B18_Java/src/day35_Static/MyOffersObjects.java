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
        // we create our objects
        // then we initialize values to each object calling the setInfo() method
        //when ever you pass object. it will do the toString method if you do have it will give you a hashcode.
        Offer offer1 = new Offer();
        offer1.setofferInfo("Ca", "Cisco", 85000, true);

        Offer offer2 = new Offer();
        offer2.setofferInfo("TX", "Peraton", 120000, true);

        Offer offer3 = new Offer();
        offer3.setofferInfo("IN", "Fire Eye", 80000, false);

        Offer offer4 = new Offer();
        offer4.setofferInfo("WA", "Fred Hutch", 156000, true);

        Offer offer5 = new Offer();
        offer5.setofferInfo("MA", "HealthEdge", 72000, true);
        // Can I put my offers in some sort of list? Yes I will put them in an Array and arrayList at the same time like this:
        Offer[] offers = {offer1, offer2, offer3, offer4, offer5};
        // Here I will add String myLocation = "TX" as my local area to use in deciding which offer I want to keep
        String myLocation = "TX";
        // Now I want to add this array into the arrayList Accept that I am creating then I will delete what I dont' want
        ArrayList<Offer> jobOffers = new ArrayList<>(Arrays.asList(offers));
        // to know how many offers are there I can use size() method
        System.out.println(jobOffers.size()); // 5

        // to remove offers I don't want like less than 100000 and that is not full time, and not local
        // ==>I can use removeIf() method like this:
        // and use boolean expression: in my case salary < 100000 || isFullTime == false || ! location.equals(myLocation)
        //jobOffers.removeIf(p-> p.Salary < 100000 || p.IsfullTime == false || !p.Location.equals(myLocation));// we remove the offer if its less than 100K or full time
        jobOffers.removeIf(p -> p.Salary < 100000);
        jobOffers.removeIf(p -> p.IsfullTime == false);
        jobOffers.removeIf(p -> !p.Location.equals(myLocation));

        System.out.println(jobOffers.size());
        for (Offer eachOffer : jobOffers) {
            // this will print what is left from offers that matches my conditions
            System.out.println(eachOffer);

        }
    }
}
