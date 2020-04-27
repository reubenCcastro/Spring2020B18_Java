package Notes;
import java.util.Arrays;
public class ArrayElementReplacement {
    public static void main(String[] args) {
        //Array element replacement
        String [] str={ "Mazhar", "Fuat", "Ozkan"}; //I have 3 elements in my string Array
        //index  0         1       2
        str[0]=str[1]; // here I am saying that now my index 0 is == my index 1 so my new index 0 is "Fuat"
        str[1]=str[0]; // here I am saying that now my index 1 is == my index 0
        // what was my index 0 => it became to Fuat . now my index 1 is "Fuat"
        str[2]=str[1]; // here I am saying that now my index 2 is == my index 1 so my new index 2 is "Fuat"
        System.out.println(Arrays.toString(str)); //In order to print my STRING I use Arrays.toString
        // When I print the Array it will be
        // [Fuat, Fuat, Fuat]

    }

}
