public class Payroll_HW {
    // step 1: declare variables
    private String employeeName;
    private String employeeId;
    private double hourlyRate;
    private double hoursWorked;

    // constructor to set name and ID
    public Payroll_HW(String name, String id) {
        employeeName = name;
        employeeId = id;
    }

    // mutator methods (setters)
    public void setHourlyRate(double rate) {
        hourlyRate = rate;
    }

    public void setHoursWorked(double hours) {
        hoursWorked = hours;
    }

    // accessor methods
    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    // method to calculate gross pay
    public double getGrossPay() {
        return hourlyRate * hoursWorked;
    }
}
