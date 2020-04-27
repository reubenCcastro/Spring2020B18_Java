package day08_IfStatements;

public class EqualNumber_MultiBranchIf {

    public static void main(String[] args) {
/*
    1.  write a program that can check the equality of the three given numberrs
 			declare 3 numbers n1, n2, n3
  			if n1 and n2 are equal  => n1&n2 are equal
   			if n2 and n3 are equal ==> n2&n3 are equal
   			if n3 and n1 are qual ==>n3&n1 are equal
			if all equal ==> all equal
			if none of them are euqal ==> none of them are equal

     */
        double n1 = 200;
        double n2 = 201;
        double n3 = 201;

        boolean n1Equalsn2 = n1==n2 && n1 !=n3; //if n1 equal to n2 and does equal n3, that makes n1 equal n2 only
        boolean n1Equalsn3 = n1==n3 && n1 !=n2;//only n1 and n3 are equal
        boolean n2Equalsn3 = n2==n3 && n2 !=n1; // only n12 == n3
        boolean allEqual = n1 == n2 && n1 ==n3; // all them are equal
        boolean noneOfThemEqual= n1 != n2 && n1 != n3 && n2 != n3; // none of them are equal

        String result = " ";


        if(n1Equalsn2){
            //System.out.println("n1 is equal to n2");
            result = "n1 is equal to n2";
        } else if (n1Equalsn3){
            //System.out.println("n1 is equal to n3");
            result = "n1 is equal to n3";
        } else if(n2Equalsn3){
            //System.out.println("n2 is equal to n3");
            result = "n2 is equal to n3";
        } else if (allEqual){
           // System.out.println("All of them are equal");
            result = "All of them are equal";
        }else{
           // System.out.println("None of them are equal");
            result = "None of them are equal";
            System.out.println(result);
        }




    }
}
