package day05_Unary_ShortandOperators;

public class PrimitiveCasting {


    public static void main(String[] args) {
        //Syntax for manual casting : dataType variableName = (dataType) variableToConvert;

        // implicit casting: done automatically
        int a = 10;
        long b = a;  // implicit casting is done automatically
                // b = 10L;

        // int c = b; // b is still long datatype

        int a1 = 100;
        long b1 = (long) a1;  // manually doing the implicit casting

        // int c1 = b1;

        // Explicit casting:

        int Inum = 100;
        byte Bnum = (byte)Inum;

        short Snum = (byte)Inum;

        // has to be same or less in explicit casting

        double Dnum = 5.5;
        float Fnum = (float)Dnum;

        double D1 = 10.5;
        long L1 = (int)D1;
        System.out.println(L1);  // 10

        float F1 = 60.5f;
        int I1 = (int) F1; // preferred the same
        System.out.println(I1);

        long largeNum = 999999999l;

        int intNum = (int) largeNum;
        System.out.println(intNum);

        char ch1 = 'a';

        char ch2 = 23456;
        double bdl1 = ch2;
        System.out.println(bdl1);


















    }
}
