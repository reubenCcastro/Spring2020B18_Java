package InterviewQuestions;

public class SumofDigitsInAString {
    public static void main(String[] args) {
        System.out.println(sumOfDigits("ABC1234"));
    }
        public  static int  sumOfDigits(String str) {

            int total = 0;

            char[] ch =  str.toCharArray();

            for(char each: ch) {

                if(Character.isDigit(each)) {

                    total += Integer.valueOf(""+each);

                }

            }

            return total;

        }
    }
// get the sum of the digit
