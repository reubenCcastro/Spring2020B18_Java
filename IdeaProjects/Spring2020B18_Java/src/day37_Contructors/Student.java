package day37_Contructors;

public class Student {
            //name, gender(M/F), and university
    String name;
    int age;
    char gender;
    String university;

    public Student(String name, int age, char gender, String university){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.university = university;
    }

    public void setInfo(String name, int age, char gender, String university){

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.university = university;

    }
    public String toString(){
        return "Name: "+name+", Age: "+age+", Gender: "+gender+", University: "+university;

    }

}
