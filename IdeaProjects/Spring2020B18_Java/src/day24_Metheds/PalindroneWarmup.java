package day24_Metheds;

public class PalindroneWarmup {
    /*
    3. write a method that can identify if a string is palindrome
    ex: palindrom("level")  ==> true
    palindrome("Cybertek") ==> false
     */
    public static void palindrome(String str){  // Anna ==>
        str = str.toLowerCase(); // anna
        String reversed = "";
        for(int i = str.length()-1; i >= 0; i--){
            reversed += str.charAt(i);
        }

        System.out.println( str.equals(reversed) );


    }

    public static void main(String[] args) {

        palindrome("level");  // annA




            }

        }




