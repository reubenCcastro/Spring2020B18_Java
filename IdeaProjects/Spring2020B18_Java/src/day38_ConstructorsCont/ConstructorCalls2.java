package day38_ConstructorsCont;

public class ConstructorCalls2 {
    /*
       Rules:
       1. only constructor can call another constructor
       2. In order to call a constructor in another constructor ==> MUST use this() keyword (this() is used to call constructors)
           this(): can only be used in a constructor calling another constructor (DO NOT USE NAME OF CONSTRUCTOR)
       3. Constructor call MUST be at FIRST step. If we call at later step ==> Compiler error
       4. A Constructor can call ONLY ONE Constructor. If we call twice ==> Compiler error
        */
    // 1st constructor: default
    public ConstructorCalls2(){
        System.out.println("Default constructor");
    }
    // 2nd constructor: with int
    public ConstructorCalls2(int a){
            this();// chain relation because using this ()  this need to be called in the first step of each constructorcall
        System.out.println("Constructor with int argument");
    }
    // 3rd constructor: with String
    public ConstructorCalls2(String str){
        this(10);// one constructor can only call one constructor, you will get complile error if you try to
        System.out.println("Constructor with string agument");
    }
    // in our main method we will try executing constructors when we create objects:
    public static void main(String[] args) {
        // here I will create my 1st object ==> Constructor will be executed (depending on what we pass or don't pass in the parameter)
        ConstructorCalls2 obj = new ConstructorCalls2(10); // we passed an int in the parameter
        // since we create our object using the 2nd Constructor (passing int) ==>
        //==> first it will print default constructor (because we called it using this();
        //==> next it will print what's in the print statement of 2nd constructor
        // these two lines will show on console:
        //1st line: Default constructor
        //2nd line: Constructor with int argument



        // here I will create my 2nd object ==> Constructor will be executed (depending on what we pass or don't pass in the parameter)
        ConstructorCalls2 obj2 = new ConstructorCalls2("Hello"); // we passed a String in the parameter
        // since we create our object using the 3nd Constructor (passing String) ==>
        //==> first it will print 2nd constructor (because we called it in the constructor using this(10); ==> it will print two statements
        //==> next it will print what's in the print statement of 3nd constructor
        // these three lines will show on console:
        //1st line: Default constructor
        //2nd line: Constructor with int argument
        //3rd line: Constructor with String argument

    }

    public void method1() {
        //will not accept
        //ConstructorCalls2 only excepts
    }
    //public String toString(){

    }

