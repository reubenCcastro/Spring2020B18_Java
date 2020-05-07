package Office_Hours.Practice_05_06_2020;

import java.util.ArrayList;
public class ScrumTeam {

    ArrayList<Tester> testersTeam = new ArrayList<>();
    ArrayList<Developers> developersTeam = new ArrayList<>();

    public void hireTester(Tester tester){
        testersTeam.add(tester);

    }
    public void fireTester(long employeeID){

        testersTeam.removeIf( p -> p.employeeID == employeeID);
    }

    public void hireDevloper(Developers developers){

        developersTeam.add(developers);
    }

    public void fireDeveloper(long employeeID){

        developersTeam.removeIf( p -> p.employeeID == employeeID);
    }


}
