import java.util.Scanner; 

public class PayrollDemo_HW {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); 
        
        // get employee name and ID
        System.out.print("Enter employee name: ");
        String name = keyboard.nextLine();

        System.out.print("Enter employee ID: ");
        String id = keyboard.nextLine();

        // create Payroll object
        Payroll_HW employee = new Payroll_HW(name, id);

        // get hours worked and hourly pay rate
        System.out.print("Enter hours worked: ");
        double hours = keyboard.nextDouble();

        System.out.print("Enter hourly pay rate: ");
        double rate = keyboard.nextDouble();

        // set the hours and rate in the object
        employee.setHoursWorked(hours);
        employee.setHourlyRate(rate);

        // display the gross pay
        System.out.println(); // enter a fresh new line to display cleaner
        System.out.println("Employee: " + employee.getEmployeeName());
        System.out.println("ID: " + employee.getEmployeeId());
        System.out.println("Gross Pay: $" + employee.getGrossPay());

    }
}
