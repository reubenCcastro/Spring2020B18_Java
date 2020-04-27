package day13_StringClass;

public class StringManipulation3 {

    public static void main(String[] args) {

        String str = "I like Java programming John";

              int num1 =  str.indexOf("John");// will return the first character

        System.out.println(num1);

        String str2 = "Cybertek school is awesome";

        int firstS = str2.indexOf("s");
        int secondS= str2.indexOf("is")+1;
        System.out.println(firstS);
        System.out.println(secondS);

        int maxIndexnumber = "Cybertex".length()-1;
        System.out.println(maxIndexnumber);

        String names = "Mutar";

             int a1 =  names.indexOf("Good Guy");
        System.out.println(a1);

        String fullName = "Kuzzat Altay";
        String firstName = fullName.substring(0, fullName.indexOf(" "));
        String lastName = fullName.substring(fullName.indexOf(" ")+1);

        System.out.println(firstName);
        System.out.println(lastName);







    }
}
