package Office_Hours.Practice_05_09_2020;

public class MiddleTwoClass {

    public String middleTwo(String str) {

        int mid1= str.length()/2 -1;
        int mid2= str.length()/2;

        // String word = "" + str.charAt(mid1) + str.charAt(mid2);
        // return word;

        return str.substring(mid1,mid2+1);

    }

}
