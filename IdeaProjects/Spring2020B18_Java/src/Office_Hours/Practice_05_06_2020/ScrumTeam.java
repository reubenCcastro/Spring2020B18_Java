package Office_Hours.Practice_05_06_2020;

import java.util.ArrayList;

public class ScrumTeam {
            // we have multiple testers and multiple developers
            // Best is to use ArrayList to be able to remove and add
             /* Attributes:
                    ArrayList<Tester>
                    ArrayList<Developers>
            Actions:
            we need to be able to fire and hire testers or developers
            hireTester(Tester tester): the given tester must be added in the arrayList of tester
            fireTester(ID): Whichever tester's ID matches with the argument, the tester will be removed from the arrayList
            */
                // Attributes of the ScrumTeam class are testers and developers:
             // we can create arrayLists for each to be able to hire and fire from lists
             // dataType of arrayList will be <Tester> first then <Developer>
    ArrayList<Tester> testersTeam = new ArrayList<>();
    ArrayList<Developers> developersTeam = new ArrayList<>();
                    // first action we are creating: hireATester() method like this:
    public void hireTester(Tester tester){ // whatever I pass in parameter I need to make sure it can be added to ArrayList testersTeam
                // I can use add method to add this tester to the array list
        testersTeam.add(tester);
                // this function is now done

    }
                // sometimes testers get fired
                // we createa a function called fireTester() ... at least I need to know the employyee ID
                 // knowing the employee ID, when we call this method, employee will be fired
    public void fireTester(long employeeID){

        testersTeam.removeIf( p -> p.employeeID == employeeID);
    }

    public void hireDevloper(Developers developers){

        developersTeam.add(developers);
    }
                // here I will create the function of firing a developer and removing the developer from the ArrayList devpTeam we created
                 // we will pass ID of developer in the parameter here

    public void fireDeveloper(long employeeID){

        developersTeam.removeIf( p -> p.employeeID == employeeID);
        // this predicate will remove any developer with an ID matching the one we pass in the parameter of our method
    }


}
