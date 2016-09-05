/**
 * Tests the Employee class.
 * 
 * @author Anthony W. Smith 
 * @version 5/31/2028
 */
public class EmployeeTester
{
    /**
     * main() method
     */
    public static void main(String[] args)
    {
        Employee harry = new Employee("Hacker, Harry", 50000);
        harry.raiseSalary(10);	// Harry gets a 10 percent raise

        System.out.println(harry.getName() + " now makes " + harry.getSalary());
    }
}

