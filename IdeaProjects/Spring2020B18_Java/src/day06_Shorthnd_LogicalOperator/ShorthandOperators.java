package day06_Shorthnd_LogicalOperator;


public class ShorthandOperators {

    public static void main(String[] args) {

        int x = 20;
            x += 10;   // x = x + 10 = 30
        System.out.println(x);

        x =+ 60;
        System.out.println(x);

        String schoolName = "Cybertek";
            schoolName += 12345; // schoolName = schoolName +12345
        System.out.println(schoolName);

        char ch1 = 'a'; // 97
             ch1 += 'b'; // 98
        // char ch1 = 195
        System.out.println(ch1); //character

        int num = 'z';  // num = 122
            num += 'x'; // num = num + 120
                        // num = 122 + 120 = 242
        System.out.println(num);

        int A = 100;
            A -= 90;
        System.out.println(A);// 100- 90 = 10

        int B = 200;
            B -= A;
        System.out.println(B); // 200 - 10 = 190

        int a = 2;
            a *= 3;
        System.out.println(a);

        int b = a *= 10;
        //  b = 6 * 10 = 60
        System.out.println(b);

        int a1 = 100;
        int b1 = (a1*= 2)  + ++a1;
           //    =   200   +  201
           //    =         401
        System.out.println(b1);

        int x1 = 10;
        int y = x1 += 10 * 2;
        //      x1 += 20;  ==>30
        System.out.println(y);


        int num1 = 300;
        num1 /= 2;  // 300 / 2 = 150
        System.out.println(num1);

        int num2 = 400;
            num2 /= 20 + 10; //  num2 = num2 / 30
                             //  num2 = 400 / 30 = 13
        System.out.println(num2);

        int num3 = 300;
            num3 %= 10 + 20; // num3 %= 30
                             // 300 %= 30 = 0
        System.out.println(num3);













    }
}
