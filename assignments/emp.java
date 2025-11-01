public abstract class emp {
    private int employeeId;
    private String firstName, lastName;

    public emp(int employeeId, String firstName, String lastName){
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public abstract double calculatePay();

    // common getters
    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public int getEmployeeId() {
        return this.employeeId;
    }

    public class PermanentEmployee extends emp {
        public double monthlySalary;
        public double allowance;

        // constructor
        
        
    }
}
