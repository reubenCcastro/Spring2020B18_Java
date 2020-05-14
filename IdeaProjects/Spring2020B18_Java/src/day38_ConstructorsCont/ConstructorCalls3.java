package day38_ConstructorsCont;

public class ConstructorCalls3 {
/*
Rules:
1. only constructor can call another constructor
2. In order to call a constructor in another constructor ==> MUST use this() keyword (this() is used to call constructors)
    this(): can only be used in a constructor calling another constructor (DO NOT USE NAME OF CONSTRUCTOR)
3. Constructor call MUST be at FIRST step. If we call at later step ==> Compiler error
4. A Constructor can call ONLY ONE Constructor. If we call twice ==> Compiler error
5. A Constructor can NOT call ITSELF. If it calls itself ==> Compiler error
6. A Constructor can NOT contain itself ==> Meaning if a constructor called another, the latter can not call the first (because of rule 5)
 */
    public ConstructorCalls3(){
        this(9);// by using this(int a); I am calling the 2nd constructor - "Int argument" will print first
        System.out.println("Default");      // this statement will print next: "Default"
    }
    public ConstructorCalls3(int a){
        //   this(); I can NOT call default here because default had called 2nd constructor already and a constructor can not call itself
        System.out.println("Int argument");
    }
    public ConstructorCalls3(String str){

        //this("W;hat up");//contructor cannt call its self it will give you a compile error
    }
    // our main method to create objects and execute constructors:
    public static void main(String[] args) {
        ConstructorCalls3 obj = new ConstructorCalls3();
    }

    public void method1(){
        //this();
    }
}
