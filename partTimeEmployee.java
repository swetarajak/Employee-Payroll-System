
public class partTimeEmployee extends Employee {

    private int hoursWorked;
    private double hourlyRate;

    public partTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return (hoursWorked * hourlyRate);
    }

}
