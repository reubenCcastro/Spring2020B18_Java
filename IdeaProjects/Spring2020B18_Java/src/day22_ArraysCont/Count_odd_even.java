package day22_ArraysCont;

public class Count_odd_even {

    public static void main(String[] args) {

        int[ ] arr = {1,2,3,4,5,6,7,8,9,10,11};

        int countOddNumber = 0;
        int countEvenNumber = 0;

        for( int each :  arr){
            /*if(each % 2 != 0){
                countOddNumber++;
            }else{
                countEvenNumber++;

             */
            if(each % 2 == 0){
                countEvenNumber++;
                continue;

            }
            countOddNumber++;

        }
        System.out.println("even numbers: "+countEvenNumber);
        System.out.println("odd numbers: "+countOddNumber);



    }
}
