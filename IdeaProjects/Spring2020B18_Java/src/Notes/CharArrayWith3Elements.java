package Notes;

public class CharArrayWith3Elements {

    public static void main(String[] args) {
        char [] ch={'a','b','c'}; // I have a char Array with 3 elements.
        int z=ch.length; // the length of the Array is 3
        int count=0;
        while(count <z-1){ //here, we are saying that while count < z-1
            count++;       // add one to the int count.
            // in first case 0<(3-1)==True - So we add one to the count (1)
            //  second round 0<(2-1)==Still true so we will add one to the count (1)
            //  third round 0(1-1) == False therefor system is not going to add (nothing)
            // any number to the count
        }                   // count = 1+1
        System.out.println(count); // So system is going to print 2
    }
    }

