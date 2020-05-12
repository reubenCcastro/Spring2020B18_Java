package day37_Contructors;

import java.util.Arrays;// only import Arrays class from java util this is preferred cause less memory
//import java.util.*; import all classes from java util
//import static day37_Contructors.Data.staticVariable; // i can use the static import from the data class.
//import static day37_Contructors.Data.staticMethod;// i can use the staticMethod from the data class
import static day37_Contructors.Data.*; // i can import all the java import
public class importStatement {
    public static void main(String[] args) {
        int[]arr = {4,3,2,1};
        // if we want to sort this array==> use sort() method
        // but first we need to import the Array class from java.util.Arrays package to use sort() method
        Arrays.sort(arr);
        // two ways to import class import java.util.Arrays;
        // import every import java.util.* but not preferred
        /*
        Static imports: we can import static variables or methods... like this
        import static packageName.className.name; // this will only import either variable or method
        but if we use this syntax:
         import static packageName.className.*; // this will import all static features (variables and methods)
         */

        System.out.println(staticVariable);
        staticMethod();
    }


}
