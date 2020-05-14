package day38_ConstructorsCont;

public class Dog {
    // Constructor Method Overloading:
    // To overload a method ==> same method name BUT must have different parameters
    // advantages of overloaded methods: readable, efficient, easy to remember, reusable, easy to maintain
    // Constructor is a METHOD ==> we can apply overloading
    // we can have multiple constructors in a class (by implementing method overloading)
   /*
    public class Dog{
        public Dog(){
            // no-arg constructor
        }
        public Dog(int age){
            // with int parameter
        }
    }
    */
    String name;
    String breed;
    int age;

    // I will create a constructor that will allow me to initialize only the breed of dog: like this:
    public Dog(){ // sets the dfeualt value for all instances
        name = "unkown";
        breed = "unknown";
        age = 0;
    }
    // I will create a constructor that will allow me ot initialize breed and age of the dog: like this:
    public Dog(String breed){
        this.breed = breed;
        name = "unkown";
        age = 0;
    }
    // we can create a constructor just like the previous one but different order of parameters : like this:
    public Dog(String breed, int age){
        this.breed = breed;
        this.age = age;
        name = "Unknow";
    }
    // we can create a constructor just like the previous one but different order of parameters : like this:
    public Dog(int age, String breed){
        this.age = age;
        this.breed = breed;
    }
    // when we use constructor creating our objects: once we pass parameter==> system will know which one use
    // so if we pass number for age first then a string for breed ==> it will use the last constructor we created.



    public String toString(){
        return "Name: "+name +", breed: "+breed+", age: "+age;
    }


/*
    public void method1(){
    }
    public void method1(int a){
    }
 */





}
