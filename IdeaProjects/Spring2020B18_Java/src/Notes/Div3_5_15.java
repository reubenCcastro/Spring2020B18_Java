package Notes;

public class Div3_5_15 {
    public static void main(String[] args) {

        //In this sample we are going to ask the system write the numbers between 1 and 30.
        // If the number is divisible by 3 code is going to change the number with "UC"
        // If the number is divisible by 5 code is going to change the number with "BES"
        // If the number is divisible by 15 code is going to change the number with "ONBES"
        for (int i = 1; i <= 30; i++) { //Since system is going to print the numbers between 1 and 30, int starts
            // from 1 and end at the number 30. since I used = signed system is going to
            // take the number 30
            if (i%3== 0 && i%5==0) {    // The first condition that I am going to check the number is divisible by 3 and 5
                System.out.print("ONBES ");} // If divisible change the number with ONBES
            else if (i % 3 == 0) {       // The second condition that I am going to check is, the number is divisible by 3
                System.out.print("UC ");  // If divisible change the number with UC
            } else if (i % 5 == 0) {      // The second condition that I am going to check is, the number is divisible by 3
                System.out.print("BES ");  // If divisible change the number with BES
            } else {
                System.out.print(i+","); // if the number is not related with any condition that was mention above it will be
                // printed as it is
            }
            //While I was printing the numbers I did not use the println. I used print!!!
        }
    }
}
