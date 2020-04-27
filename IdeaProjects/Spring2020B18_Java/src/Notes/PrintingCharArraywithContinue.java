package Notes;

public class PrintingCharArraywithContinue {

    public static void main(String[] args) {
        // Printing numbers from Array and using continue function
        char[] ch = {'a', 'b', 'c', 'd'}; // I have a char Array here
        for (char each : ch) { // Again I am saying that take every each character from ch Array
            if (each == 'd') { //except 'd'
                continue;
            }
            System.out.print(each + " "); //When I print my statement it will be a b c
        }
    }
}
