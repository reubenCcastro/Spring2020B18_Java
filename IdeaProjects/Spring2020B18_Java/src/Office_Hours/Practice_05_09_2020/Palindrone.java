package Office_Hours.Practice_05_09_2020;

public class Palindrone {

    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("asdhau"));
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        // racecar
        // abcddcba
        for(int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }

        return true;
    }
}
