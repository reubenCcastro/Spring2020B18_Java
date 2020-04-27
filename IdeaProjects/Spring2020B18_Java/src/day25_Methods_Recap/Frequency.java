package day25_Methods_Recap;

public class Frequency {

    public static void main(String[] args) {
        String str1 = "AAA";//AA
        String str2 = "A";

        int count = 0;//First need a variable if str1 contains str2 then increase count by one
        //if(str1.contains(str2)){ this will give you the letters
        while(str1.contains(str2)){// use while loop to get how many times it prints out
            count++;
            str1 = str1.replaceFirst(str2, "");
            //      we need to make sure we are not counting the same index over again
        }
        //System.out.println(str1); to print AA
        System.out.println(count);// print 3

        String a = "python python python python";
        String b = "python";

        int num1 = Frequency(a,b);
        System.out.println(num1);
    }

    public static int Frequency(String str1, String str2){
        int count = 0;//First need a variable if str1 contains str2 then increase count by one

        while(str1.contains(str2)) {// use while loop to get how many times it prints out
            count++;
            str1 = str1.replaceFirst(str2, "");
            //      we need to make sure we are not counting the same index over again
        }
        return count;
    }
}
