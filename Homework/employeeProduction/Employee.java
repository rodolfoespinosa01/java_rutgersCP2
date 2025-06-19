public class Employee {
    private String name;
    private String employeeNumber;
    private String hireDate;

    // default constructor
    public Employee() {
        name = "";
        employeeNumber = "";
        hireDate = "";
    }

    // constructor with parameters
    public Employee(String name, String employeeNumber, String hireDate) {
        this.name = name;
        this.employeeNumber = employeeNumber;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }
}
