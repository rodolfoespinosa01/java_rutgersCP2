// ProductionWorkerDemo.java
public class ProductionWorkerDemo {
    public static void main(String[] args) {
        // create a ProductionWorker object
        ProductionWorker worker = new ProductionWorker("Rodolfo Espinosa Nunez", "Z000", "01/15/2025", 1, 42.00);

        // display the information
        System.out.println("Employee Name: " + worker.getName());
        System.out.println("Employee Number: " + worker.getEmployeeNumber());
        System.out.println("Hire Date: " + worker.getHireDate());
        System.out.println("Shift: " + worker.getShiftName());
        System.out.println("Hourly Pay Rate: $" + worker.getHourlyPayRate());
    }
}
