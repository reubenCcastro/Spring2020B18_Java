package day26_MethodsOverloading;
/*
Warmup tasks:
	1. write a return method called frequency that accepts two parameters: string str and char ch,
		the method returns the frequency of the ch from the str as an int
			Ex:
				frequency("AAA", 'A') ==>  3 first put this two down
				frequency("ABAB", 'B') ==> 2
			Note: MUST use Arrays and for each loop use the .toCharArray method that returns a char [] arr
			compare the char with the String, you can you the for each loop , need a variable condition count
			to count how many times.

 */
public class Frequency {

    public static void main(String[] args) {
        String str = "AAA";
        char ch = 'A';

        char[]arr = str.toCharArray();// analizy the loop it get executed three times // [A,A,A]

        int  count = 0;// count will go up every time cause there are three letters
        for(char each : arr) {
            if (each == ch) {// the compiler will see if the char letters are equal.
                count++;
            }
        }
            System.out.println(count);

            String str2 = "ABDDEDBBBBBEDEDBEDEBD";
            char ch2 ='B';
            int num1 = frequency(str2, ch2);// this functionality is going to see how many
        // time that these two parameter(str2, ch2) are in both.
            System.out.println(num1);
        }

        public static int frequency(String str, char ch){// it only counts one char frequency
            char[]arr = str.toCharArray();
            int  count = 0;// count will go up every time cause there are three letters
            for(char each : arr){
                if(each ==ch){// the compiler will see if the char letters are equal.
                    count++;
                }
        }
            return count;
    }

}
