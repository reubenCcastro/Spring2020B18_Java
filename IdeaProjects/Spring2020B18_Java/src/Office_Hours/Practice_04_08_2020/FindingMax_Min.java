package Office_Hours.Practice_04_08_2020;

import java.util.Scanner;

public class FindingMax_Min {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int max = -2147483628;
        int min = 214748367;
        int i = 1;
        while(i <= 5){

            System.out.println("Enter a number");
            int num = input.nextInt();

            if(num > max) {// whichever the userinput is larger , will be assigned to max
                max = num;
            }
                if(num < min){// whichever the userinput is smaller , will be assigned to min
                    min = num;
                }
            i++;
        }
        System.out.println("Maximum number is : "+max);
        System.out.println("Minimum number is : "+min);



    }
}
