public class ProductionWorker extends Employee {
    private int shift; // 1 = day, 2 = night
    private double hourlyPayRate;

    // default constructor
    public ProductionWorker() {
        super();
        shift = 1;
        hourlyPayRate = 0.0;
    }

    // constructor with parameters
    public ProductionWorker(String name, String employeeNumber, String hireDate, int shift, double hourlyPayRate) {
        super(name, employeeNumber, hireDate);
        this.shift = shift;
        this.hourlyPayRate = hourlyPayRate;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public String getShiftName() 
    {
        if (shift == 1) {
            return "Day";
        } else {
            return "Night";
        }
    }
}
