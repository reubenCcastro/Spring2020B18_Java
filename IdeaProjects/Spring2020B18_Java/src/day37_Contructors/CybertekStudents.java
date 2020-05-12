package day37_Contructors;

public class CybertekStudents {

    static String schoolName;
    String studentName;// we must need to know
    String batch;// we must need to know
    int groupNumber;// we must need to know

    // Can the object
    public CybertekStudents(String studentName, String batch, int groupNumber) {
        schoolName = "Cybertek";
        this.studentName =studentName;
        this.batch = batch;
        this.groupNumber = groupNumber;


    }

    public String toString() {
        return "Name: "+studentName+" , Batch"+batch+", group number"+groupNumber+"SchoolName is: "+schoolName;
    }
}

class CyberTekObjects{

    public static void main(String[] args) {
        CybertekStudents students1 = new CybertekStudents("Reuben", "B18",8 );
        System.out.println(students1);
        students1.schoolName="Cybertek School";
        CybertekStudents students2 = new CybertekStudents("Cliff", "B18", 8);
        System.out.println(students2);

    }

}

