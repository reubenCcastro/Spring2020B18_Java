package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffersObjects {

    public static void main(String[] args) {
        Offer offer1 = new Offer();
        offer1.setofferInfo("San Jose, Ca", "Cisco", 85000,true);

        Offer offer2 = new Offer();
        offer2.setofferInfo("El Paso, TX", "Peraton", 120000, true);

        Offer offer3 =  new Offer();
        offer3.setofferInfo("Bangalore, IN", "Fire Eye", 80000,false );

        Offer offer4 = new Offer();
        offer4.setofferInfo("Seattle, WA", "Fred Hutch", 56000, false);

        Offer offer5 =  new Offer();
        offer5.setofferInfo("Burlington, MA", "HealthEdge", 72000, true);

        ArrayList<Offer> jobOffers = new ArrayList<>();
        jobOffers.addAll(Arrays.asList(offer1,offer2,offer3,offer4,offer5));

        for(int i = 0; i < jobOffers.size(); i++){
            Offer eachOffer = jobOffers.get(i);
            System.out.println(eachOffer);

        }
        System.out.println("==========================================");
        jobOffers.removeIf(p -> !p.IsfullTime );
        for(int i = 0; i < jobOffers.size(); i++) {
            Offer eachOffer = jobOffers.get(i);
            System.out.println(eachOffer);
        }
        System.out.println("============================================");
        jobOffers.removeIf(p -> p.Salary < 100000);
        for(int i = 0; i < jobOffers.size(); i++) {
            Offer eachOffer = jobOffers.get(i);
            System.out.println(eachOffer);
        }
        System.out.println("==========");
        jobOffers.removeIf(p->!p.Location.contains("TX"));
        for(int i = 0; i < jobOffers.size(); i++) {
            Offer eachOffer = jobOffers.get(i);
            System.out.println(eachOffer);
        }

    }
}
