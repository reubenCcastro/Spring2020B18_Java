package Office_Hours.Practice_05_06_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class DevelopersObject {

    public static void main(String[] args) {

        Developers developers1 = new Developers();
        developers1.setDeveloperInfo("Mike", 123, "Senior Developer", 120000);
        Developers developers2 = new Developers();
        developers2.setDeveloperInfo("Tommy", 124, "Junior Developer", 120000);
        developers1.fixingBugs();
        System.out.println("=========================================");

        Developers[]arr = {developers1,developers2};

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        System.out.println("===========================");
        for(Developers each :arr){
            System.out.println(each);
        }
        System.out.println("=================================");

        ArrayList<Developers>developers = new ArrayList<>(Arrays.asList(arr));
        //developers.addAll(Arrays.asList(developers1, developers2));
        System.out.println(developers.size());
        for(int i = 0; i < developers.size();i++){
            System.out.println(developers.get(i));
        }

        System.out.println("==========================");
        for(Developers each : developers){
            System.out.println(each);
        }
    }

}
