package Office_Hours.Practice_05_06_2020;
/*
        create scrum2: 4 developers, 2 testers
        create scrum3: 5 developers, 3 testers
        create an array of scrum: {scrum1, scrum2, scrum3};
            1. iterator the array to print out all the testers who have salary > 120000
            2. print out all the developers who have salary < 120000
        create an ArrayList of scrum: {scrum1, scrum2, scrum3};
               1. remove all the testers who have salary < 100000
               2. remove all the developers who have salary < 120000
           NOTE: DO NOT create any ArrayList of Testers or Developers.
                Use the ArrayLists in ScrumTeam class only
         */
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Arrays;

public class AppleINC {

    public static void main(String[] args) {
        Tester tester1 = new Tester();
        tester1.setTesterInfo("Luna", 11343, "QA", 200000.00);
        Tester tester2 = new Tester();
        tester2.setTesterInfo("Will", 2344343, "Senior SDET", 130000);

        Tester tester3 = new Tester();
        tester3.setTesterInfo("Sha Clark", 623533, "SDET", 100000);

        Tester tester4 = new Tester();
        tester4.setTesterInfo("Mehmet", 12324, "SDET", 150000);

        Tester tester5 = new Tester();
        tester5.setTesterInfo("Ayla", 87842, "QA", 1200001);

        Tester tester6 = new Tester();
        tester6.setTesterInfo("Sevinc", 5425346, "Senior SDET", 95000);

        Tester tester7 = new Tester();
        tester7.setTesterInfo("Mehmet", 32434413, "SDET", 100000);

        Tester tester8 = new Tester();
        tester8.setTesterInfo("Ridvan", 54635747, "QA", 120001);

        Developers developers1 = new Developers();
        developers1.setDeveloperInfo("Muhtar", 111, "Manual Tester", 120001);

        Developers developers2 = new Developers();
        developers2.setDeveloperInfo("John", 22222, "Uber Driver", 60000);

        Developers developers3 = new Developers();
        developers3.setDeveloperInfo("Tuncay", 6564575, "President", 135000);

        Developers developers4 = new Developers();
        developers4.setDeveloperInfo("Shukhart", 3452467, "Vice President", 123000);

        Developers developers5 = new Developers();
        developers5.setDeveloperInfo("Oguljahan ", 87865, "Team Chief", 121000);

        Developers developers6 = new Developers();
        developers6.setDeveloperInfo("Kanat", 43465, " Senior Developer", 110000);

        Developers developers7 = new Developers();
        developers7.setDeveloperInfo("Cerdeniz", 86564, "Junior Developer", 95000);

        Developers developers8 = new Developers();
        developers8.setDeveloperInfo("Harika", 32413567, " President", 134000);

        Developers developers9 = new Developers();
        developers9.setDeveloperInfo("Trevor", 9543343, "Vice President", 110020);

        Developers developers10 = new Developers();
        developers10.setDeveloperInfo("Noah", 9656, "Team Chief", 123243);

        Developers developers11 = new Developers();
        developers11.setDeveloperInfo("Tim", 13224314, "Cap", 230000);


        ScrumTeam scrum1 = new ScrumTeam();
        scrum1.hireTester(tester3);
        scrum1.hireTester(tester1);
        scrum1.hireTester(tester2);
        scrum1.hireDevloper(developers1);
        scrum1.hireDevloper(developers2);


        ScrumTeam scrum2 = new ScrumTeam();
        scrum2.hireTester(tester4);
        scrum2.hireTester(tester5);
        scrum2.hireDevloper(developers3);
        scrum2.hireDevloper(developers4);
        scrum2.hireDevloper(developers5);
        scrum2.hireDevloper(developers11);


        ScrumTeam scrum3 = new ScrumTeam();
        scrum3.hireTester(tester6);
        scrum3.hireTester(tester7);
        scrum3.hireTester(tester8);
        scrum3.hireDevloper(developers6);
        scrum3.hireDevloper(developers7);
        scrum3.hireDevloper(developers8);
        scrum3.hireDevloper(developers9);
        scrum3.hireDevloper(developers10);

        // scrum1.testersTeam   //returns the testersTeam arrayList from scrum1
        for (Tester each : scrum1.testersTeam) {
            System.out.println("Scrum1 Testers: " + each);
        }
        for (Developers each : scrum1.developersTeam) {
            System.out.println("Scrum1 Developers: " + each);
        }
        System.out.println("In scrum team 1, we have " + scrum1.testersTeam.size() + " testers and " + scrum1.developersTeam.size() + " developers");
        System.out.println("=================================================================================================================");
        for (Tester each : scrum2.testersTeam) {
            System.out.println("Scrum2 Testers: " + each);
        }
        for (Developers each : scrum2.developersTeam) {
            System.out.println("Scrum2 Developers: " + each);
        }
        System.out.println("In scrum team 2, we have " + scrum2.testersTeam.size() + " testers and " + scrum2.developersTeam.size() + " developers");
        System.out.println("================================================================================================================");
        for (Tester each : scrum3.testersTeam) {
            System.out.println("Scrum3 Testers: " + each);
        }
        for (Developers each : scrum3.developersTeam) {
            System.out.println("Scrum3 Developers: " + each);
        }
        System.out.println("In scrum team 3, we have " + scrum3.testersTeam.size() + " testers and " + scrum3.developersTeam.size() + " developers");
        System.out.println("=================================================================================================================");

        ScrumTeam[] scrum = {scrum1, scrum2, scrum3};

        for (int j = 0; j < scrum.length; j++) {
            for (int i = 0; i < scrum[j].testersTeam.size(); i++) {
                if (scrum[j].testersTeam.get(i).salary > 120000) {
                    System.out.println("Testers: " + scrum[j].testersTeam.get(i).name + " make over $120,000.00.");

                }

            }

            for (int i = 0; i < scrum[j].developersTeam.size(); i++) {
                if (scrum[j].developersTeam.get(i).salary < 120000) {
                    System.out.println("Developers: " + scrum[j].developersTeam.get(i).name + " make less than $120,000.00.");

                }
            }
        }
        System.out.println("=========================================================================================================");
        ArrayList<ScrumTeam> scrumsquad = new ArrayList<>(Arrays.asList(scrum));
        for (ScrumTeam each : scrumsquad) {

            for (int i = 0; i < each.testersTeam.size(); i++) {
                System.out.println("Tester: "+each.testersTeam.get(i).name + " makes less than $100,000.00");

            }

            for (int i = 0; i < each.developersTeam.size(); i++) {

                if (each.developersTeam.get(i).salary < 120000) {
                    System.out.println("Developer: "+each.developersTeam.get(i).name + " makes less than $120,000.00");

                }
            }
        }
    }
}














