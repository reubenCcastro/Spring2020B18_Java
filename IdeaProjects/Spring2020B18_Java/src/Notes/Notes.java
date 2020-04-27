package Notes;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
public class Notes {

    public static void main(String[] args) {

        /*
An array declaration has two components: the type and the name. type declares the element type of the array. The element type determines
the data type of each element that comprises the array. Like array of int type, we can also create an array of other primitive
data types like char, float, double..etc or user defined data type(objects of a class).Thus, the element type for the array determines
what type of data the array will hold.
 */
        int[] arr = {100, 200, 300}; // Here- our data type is int
        // this is one dimensional array  and it has 3 elements. this means the Length of the Array is 3
        // and the maximum index number is 2

        System.out.println(arr[1]);

        //in order to call index one element from the arr Array we use System.out.println(arr[1]);
        // the above print method will call the element at the index 1
        //from the index #1===>200

        //Let's execute the code!

        System.out.println("=============================");

        for (int i = 0; i < 3; i++) { //In this loop i represents the elements of the index numbers
            //  For ex: First element== index 0== 100
            int number = arr[i]; //here in the code- I assigned my index i element to my new defined int variable
            //
            System.out.println(number);
            //Let's execute the code!
        }

        System.out.println("OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
        //other way of doing it is:

        int j = 0; //my index number
        while (j < 3) { // while loop is going to execute the below code 3 time
            // every each time iteration(repetition of a mathematical or computational
            // procedure applied to the result of a previous application

            int num = arr[j]; // in this step index j assigned to the int num.
            System.out.println(num);
            j++; // we do place the iteration after the print statement because we want system start to count after run the program once
        }
        //Let's execute the code!

        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

        String[] names = {"NAME1", "NAME2", "NAME3"}; // This is a one dimensional String Array

        int namesL = names.length; // length metod used to find the length of the Array
        //Since result is going to be a we use int

        String[] namesRev = new String[namesL];// in order to find and print the reverse version of the names Array
        // We need to define an empty Array with length of the names.length.
        // technically we can assign a number however this method will not be
        // applicable different length arrays.

        namesRev[0] = names[2]; // in this statement we are saying that- in my new Revers array
        // my index 0 will be == index 2 in the names array.
        namesRev[1] = names[1];
        namesRev[2] = names[0];

        System.out.println(Arrays.toString(namesRev)); // Since result is going to be one dimensional String Array
        // we have to use the Arrays.toString (name of the StringArray)
        // in this case  System.out.println(Arrays.toString(namesRev));
        //Let's execute the code!

        System.out.println("<><><><><><><><><><><><><><><>");


        int k = names.length - 1;               // Maximum index number
        for (int t = 0; t < namesL; t++) {

            namesRev[t] = names[k];              // in this statement we are saying that- new Revers array's
            //  index t will be == index k in the names array.
            k--;
        }
        System.out.println(Arrays.toString(namesRev));

        //Let's execute the code!

        System.out.println("+++++++++++++++++++++++++++++");

        String[] names2 = {"NAME3", "NAME4", "NAME5"};  // this is the way how can we write the same code with while
        int namesL2 = names2.length;                    //Length of the names
        String[] namesRev2 = new String[namesL];        // New array determined with the length of the Array
        int z = 0;
        int y = names2.length - 1;                      // y is the maximum index number of the names2
        while (z < names2.length) {
            namesRev2[z] = names2[y];
            z++;                                         // while new arrays' index number increasing 1by1 starting from zero
            y--;                                          // names's index numbers are decreasing one by one

        }
        System.out.println(Arrays.toString(namesRev2)); // as usual we have to use the Arrays.toString()

        //Let's execute the code!


        //Array Utilities : import java.util.Arrays;

        int[] arr5 = {9, 10, 8, 65, 8, 6, 5};


        Arrays.sort(arr5); // Arrays.sort() helps us to sort the given data smaller to bigger or a-z
        System.out.println(Arrays.toString(arr5)); // in order to print that array we are going use the
        // Arrays.toString() method
        System.out.println("=========================");

        int[] salaries = {10000, 20000, 30, 5000, 432, 123123, 200000}; // in this sample we are going to find the
        int salariesL = salaries.length;
        int salariesIndex = salariesL - 1;
        Arrays.sort(salaries);
        System.out.println(Arrays.toString(salaries));
        System.out.println("min salary is: " + salaries[0]);
        System.out.println("=========================");

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println("=========================");

        int[] arr3 = {1, 2, 3};
        int[] arr4 = {2, 3, 1};
        Arrays.sort(arr3);
        Arrays.sort(arr4);
        System.out.println(Arrays.equals(arr3, arr4));
        System.out.println("============================");

        String[] a = {"Name1", "Name2", "Name3"};
        String[] b = {"Name3", "Name1", "Name2"};

        Arrays.sort(a);
        // System.out.println(Arrays.toString(a));
        Arrays.sort(b);
        // System.out.println(Arrays.toString(b));
        System.out.println(Arrays.equals(a, b)); //True
        System.out.println();
    }
}


//ARRAY Methods
// we do get the import java.util.Arrays;
// Arrays.sort()
// Arrays.equal()
//Arrays.toString()
//Arrays.deepTOString


// StringMethods




