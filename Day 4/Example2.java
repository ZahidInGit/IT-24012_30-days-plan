
class Employee {

    private String name;
    private double salary;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double amount) {
        if (amount > 0) {
            this.salary = amount;
        } else {
            System.out.println("Invalid salary amount.");
        }
    }
}

public class Example2{

    public static void main(String[] args) {
        Employee emp = new Employee("Sarah");

        emp.setSalary(50000);

        System.out.println("Employee: " + emp.getName());
        System.out.println("Salary: $" + emp.getSalary());
    }
}
