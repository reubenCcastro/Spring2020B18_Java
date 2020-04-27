package day13_StringClass;

public class StringManipulation2 {

    public static void main(String[] args) {

        String str = "Cybertek School is the best";
        //            012345678
        String schoolName = str.substring(0,15);// next to add one more number to give what you wanted printed

        System.out.println(schoolName);

        String fullName = "Kuzzat Altay";
        //                 01234567891011
        String firstName = fullName.substring(0, 6);
        String lastName = fullName.substring(7, 11+1);

        System.out.println(firstName);
        System.out.println(lastName);


       // System.out.println(firstName+" "+lastName);

        String Murtaza = "Murtaza Nazeeri";
        //                0123456 7 89101112131415
        String firstname = Murtaza.substring(0,6+1);
        String lastname = Murtaza.substring(8, 14+1);
        System.out.println(firstName);
        System.out.println(lastName);

        String gmail = lastname.concat("_").concat(firstname).concat("@gmail.com");
        // two ways use the top one not the bottom
        //String gmail = lastname + "_" + firstName + "@gmail.com";
        System.out.println(gmail);

        String s1 = "I love Java Programing Language";
        //
        String className = s1.substring(7);
        System.out.println(className);

        String s2 = "I like C# Programming C# C#";
        s2 = s2.replace("C#",  "Java");
        System.out.println(s2);

        String r1 = "I like C#, C# is fun, C# is cool";
        r1 = r1.replaceFirst("C#", "Java");
        System.out.println(r1);
        String r2 = "Tomorrow is Monday, Tomorrow is Tuesday";
        r2 = r2.replaceFirst("Tomorrow", "Today");

        System.out.println(r2);


    }
}
