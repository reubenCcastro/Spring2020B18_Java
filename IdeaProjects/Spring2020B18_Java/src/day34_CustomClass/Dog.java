package day34_CustomClass;

public class Dog {
                // attributes: breed, size, age, color
                // actions: sleep(), eat(), run(), sit()
    String Breed;
    String Size;
    String Color;
    int Age;
    String Name;
                // when I create the dog's object I should be able to assign all instance variables I have here as attributes at once
                // I need to create a method to let me assign values to these instance variables.
                // every time I call this method setDogInfo() I should be able to pass values of breed, size, age, color of my dog ==>
                //==> I need to pass the parameters I need for the variables

                // let' s create the action for eating:

    public void eating(String food){
                 // i can call this eating method from the objects I have: dog1, dog2 ...
        System.out.println(Name+" is eating "+food);
    }

    public void drinking(String drink){
        System.out.println(Name+" is drinking "+drink);
    }

    public void playing(String toy){
        System.out.println(Name+" is playing"+toy);
    }

    public void studying(String subject){
        System.out.println(Name+" is studying "+subject);
    }
                // now we can try those methods eating(), drinking(), playing() in DogObjects2
    public void setDogInfo(String Breed, String Size, int Age, String Color, String Name){
                // if local variable (the parameter) has same name with instance variable when we assign we use "this": ==>
                // ==> this.breed = breed ("this" calls the instance variable to assign it to the parameter we passed)this.Breed = Breed;
       this.Size = Size;
       this.Age = Age;
       this.Color = Color;
       this.Name = Name;

                //this keyword is used for calling object instance (instance variable)
                //by using "this" keyword ........
                // the benefit of this method is grouping .....
    }
                // when we pass the object in the print statement ==> compiler automatically uses toString() method to print
    public String toString(){
        return "Dog Name: "+Name+", breed: "+Breed+", size: "+Size+" color: "+Color+" age: "+Age;
    }


    }

