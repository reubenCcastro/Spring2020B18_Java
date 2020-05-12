package day37_Contructors;

public class ConstructorIntro {
                     // What in this class right now. nothing


                    //public method(){}//constructor name MUST be same with class name
                    // we can create a constructor on my own
    public ConstructorIntro(int a){
                    // this method need to be executed sometime so we need the object to be created

        System.out.println("Constructor with argument of int");



}


                //now we have a main method
    public static void main(String[] args) {
                //every class must have an constructor that's already been created and hidden.
                // how do i know there is a constructor by creating an object.



                // need to follow the following syntax
                // Access-modifier MethodName(Parameters){
                // MethodName needs to be the same as the class
                //this is creating the constructor
        //ConstructorIntro obj = new ConstructorIntro();// object MUST be created with existing constructor
                                  //this is the default constructor part
        ConstructorIntro obj2 = new ConstructorIntro(12); //we just created the object with the constructor
        ConstructorIntro obj3 = new ConstructorIntro(20);

    }
}
