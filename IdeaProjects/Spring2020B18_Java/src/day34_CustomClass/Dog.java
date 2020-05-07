package day34_CustomClass;

public class Dog {
    String Breed;
    String Size;
    String Color;
    int Age;
    String Name;


    public void eating(String food){
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
    public void setDogInfo(String Breed, String Size, int Age, String Color, String Name){
       this.Breed = Breed;
       this.Size = Size;
       this.Age = Age;
       this.Color = Color;
       this.Name = Name;

       //this keyword is used for calling object (instance variable)
    }

    public String toString(){
        return "Dog Name: "+Name+", breed: "+Breed+", size: "+Size+" color: "+Color+" age: "+Age;
    }


    }

