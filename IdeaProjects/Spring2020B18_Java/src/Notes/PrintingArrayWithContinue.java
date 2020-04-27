package Notes;

public class PrintingArrayWithContinue {

    public static void main(String[] args) {
        // Printing numbers from Array and using continue function
        int[] nums = {5, 4, 3, 2, 1};
        for (int each : nums) //My variable each is==each element of the num Array
        {
            if (each == 3) { // while printing the numbers if number is ==3
                continue;    // do not print it and continue
            }
            System.out.print(each); // I printed my numbers excluded 3 . Because my if statement was telling the
            // system to skip the 3. Therefor my printed statement is 5421
        }
    }
}
