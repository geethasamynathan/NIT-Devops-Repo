public abstract class employee {
    private int employeeId;
    private String firstName, lastName;

    // common constructor
    public employee(int employeeId, String firstName, String lastName){
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // need to be override
    public abstract double calculatePay();

    // common getters
    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public int getEmployeeId() {
        return this.employeeId;
    }

    // -- class for Permanent Employee --
    public class PermanentEmployee extends employee {
        public double monthlySalary;
        public double allowance;

        // constructor
        public PermanentEmployee(int employeeId, String firstName, String  lastName, double monthlySalary, double allowance) {
            // super calls the employee constructor
            super(employeeId, firstName, lastName);
            this.monthlySalary = monthlySalary;
            this.allowance = allowance;

            // System.out.println("Employee full name "+firstName +" "+lastName);

        }

        @Override
        public double calculatePay() {
            return this.monthlySalary + this.allowance;
        }   
    }

    // -- class for Contract Employee --
    public class ContractEmployee extends employee {
        public double hourlySalary;
        public int hoursWorked;

        // constructor for contract employee
        public ContractEmployee(int employeeId, String firstName, String lastName, double hourlySalary) {
            super(employeeId, firstName, lastName);
            this.hourlySalary = hourlySalary;
        }

        // seperate method for number of hours worked
        public void setHoursWorked(int hours) {
            this.hoursWorked = hours;
        }

        @Override
        public double calculatePay() {
            return this.hourlySalary * this.hoursWorked;
        }
        
    }

    public static void main(String[] args) {
        
        PermanentEmployee emp1 = new PermanentEmployee(101, "Mujaffar", "Sheikh", 50000, 20000);

    }
}
