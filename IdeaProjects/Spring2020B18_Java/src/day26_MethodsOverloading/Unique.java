package day26_MethodsOverloading;

public class Unique {
    /*
    2. use the above method to create another called uniques that accepts a string paramter and returns it's
	unique characters as String
			Ex: uniques("ABBC"); 		==> "AC"
				uniques("Cybertek");  	==> "cybrtk"
				 */
    public static void main(String[] args) {
        String str = "ABBBCDB";

        String result = ""; //ACD
        for(int i=0; i < str.length(); i++){
            int num = Frequency(str, str.charAt(i) );
            if( num == 1){
                result += str.charAt(i);
            }
        }


        System.out.println(result);

        String str2 = "Cybertek";
        String result2 =  uniques(str2);
        System.out.println(result2);



    }

    public static String uniques(String str){ // "AABCDCD"
        String result = ""; //ACD
        for(int i=0; i < str.length(); i++){
            int num = Frequency(str, str.charAt(i) );
            if( num == 1){
                result += str.charAt(i);
            }
        }

        return result;
    }


    public static int Frequency(String str, char ch){ // counts the ch' frequency
        char[] arr =  str.toCharArray(); // [A, B, B]

        int count = 0; //1
        for(char each  : arr ){ //3   each: A , B, B
            if(each == ch){
                count++;
            }
        }

        return count;
    }



}