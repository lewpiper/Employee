
/**
 * The employee class will name and salary and return the name salary and increase in the employees salary by a certain percentage.
 * 
 * @author Lew Piper
 * @version 9/11/2016
 */
public class Employee
{
    //Define variables and instantiate them
    private double byPercent = 0;
    private String Name = " ";
    private double Salary = 0;

    //Copy the name and salary passed in from the other class into the private variables
    public Employee(String Name, double Salary)
    {
        this.Name = Name;
        this.Salary = Salary;
    }

    //Return the Name String created in this class if this method is invoked
    public String getName() {
        return Name;
    }
    
    //Return the Salary double created in this class if this method is invoked
    public double getSalary() {
        return Salary;
    }
    
    //Calculate the raise in the salary via the double that is passed in when this method is invoked
    public void raiseSalary(double byPercent) {
        Salary = (Salary * (byPercent/100)) + Salary;
    }
}
