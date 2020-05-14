package day38_ConstructorsCont;
/*
    Rules:
    1. only constructor can call another constructor
    2. In order to call a constructor in another constructor ==> must use this() keyword (this() is used to call constructors)
        this() can only be used in a constructor calling another constructor. (DO NOT USE NAME OF CONSTRUCTOR)
     */
// first constructor method:
public class ConstructorCalls {
    public ConstructorCalls(){
        method1();
        method2();
    }
    // second constructor method:
    public ConstructorCalls(int a){
        //ConstructorCalls can call this class in side itself
        this();//one constructor can call another constructor by this();
    }
    public static   void method1(){
        //method2();no void cant go in a static
        //ConstructorCalls()
    }
    public void method2(){

    }
}
