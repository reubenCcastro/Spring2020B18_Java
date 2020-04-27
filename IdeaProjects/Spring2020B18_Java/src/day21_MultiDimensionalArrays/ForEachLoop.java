package day21_MultiDimensionalArrays;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class ForEachLoop {

    public static void main(String[] args) {


        int[]arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.sort(arr1);


        for(int each : arr1){
            if(each < 5){
                continue;

            }
            System.out.println(each);

        }
        System.out.println("=================");
        String sentence = "I like Java";

        String []words = sentence.split(" ");

        for(String eachWord : words){
            System.out.println(eachWord);
        }

        System.out.println("================================");

        for (int i = words.length-1; i >= 0;i--){


        }
    }


}
