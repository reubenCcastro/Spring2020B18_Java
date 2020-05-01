package day32_Warmup;
/*
write a program that can return the duplicated values from an ArrayList of String
		Ex:
			list: {"A", "B", "A", "C", "D"};
			output: ["A"]
			list: {"A", "B", "B", "C", "D", "D"};
			output: ["A", "C"]
 */
import java.util.ArrayList;
import java.util.Arrays;

public class ReturnDuplicateValue {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("A", "B", "B", "C", "D", "D"));
        for (String each : list) {
            int count = 0;
            for (String each1 : list) {
                if (each == each1) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(each);
            }


        }
    }
}
