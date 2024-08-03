
public class Main {

    public static void main(String[] args) {
        PayrollSystem system = new PayrollSystem();
        FullTimeEmployee emp_f1 = new FullTimeEmployee("Sweta", 1, 700000);
        partTimeEmployee emp_p1 = new partTimeEmployee("Alex", 2, 40, 100);

        system.addEmployee(emp_f1);
        system.addEmployee(emp_p1);
        System.out.println("Initial Employee Details");
        system.displayEmployees();
        System.out.println("Removing Employee");
        system.removeEmployee(2);
        System.out.println("Initial Employee Details");
        system.displayEmployees();

    }
}

