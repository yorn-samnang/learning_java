import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {

        SalariedEmployee salariedEmployee = new SalariedEmployee("John Doe", "1980-05-15", null, 52000);
        System.out.println(salariedEmployee.toString());
        System.out.println("Age: " + salariedEmployee.getAge());
        System.out.println("Paycheck: " + salariedEmployee.collectPay());
        salariedEmployee.retire("2023-12-31");
        System.out.println("After retirement, Paycheck: " + salariedEmployee.collectPay());

        HourlyEmployee hourlyEmployee = new HourlyEmployee("Jane Smith", "1990-08-20", null, 20);
        System.out.println(hourlyEmployee.toString());
        System.out.println("Age: " + hourlyEmployee.getAge());
        hourlyEmployee.addHours(40);
        System.out.println("Paycheck: " + hourlyEmployee.collectPay());
        hourlyEmployee.terminate("2023-12-31");
        hourlyEmployee.addHours(40);
        System.out.println("After termination, Paycheck: " + hourlyEmployee.collectPay());
    }
}

class Worker {
    private String name;
    private LocalDate birthDate;
    private LocalDate endDate;

    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = LocalDate.parse(birthDate);
        this.endDate = (endDate != null) ? LocalDate.parse(endDate) : null;
    }

    public int getAge() {
        return Period.between(this.birthDate, LocalDate.now()).getYears();
    }

    public boolean isRetired() {
        return endDate != null && !endDate.isAfter(LocalDate.now());
    }

    public double collectPay() { return 0.0; }

    public void terminate(String endDate) {
        this.endDate = LocalDate.parse(endDate);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", endDate=" + endDate +
                ", retired=" + isRetired() +
                '}';
    }
}

class Employee extends Worker {
    public Employee(String name, String birthDate, String endDate) {
        super(name, birthDate, endDate);
    }
}

class SalariedEmployee extends Employee {
    private double annualSalary;

    public SalariedEmployee(String name, String birthDate, String endDate, double annualSalary) {
        super(name, birthDate, endDate);
        this.annualSalary = annualSalary;
    }

    public void retire(String retireDate) {
        terminate(retireDate);
    }

    @Override
    public double collectPay() {
        double paycheck = annualSalary / 26.0;
        return isRetired() ? 0.9 * paycheck : paycheck;
    }

    @Override
    public String toString() {
        return super.toString() + ", annualSalary=" + annualSalary;
    }
}

class HourlyEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public HourlyEmployee(String name, String birthDate, String endDate, double hourlyRate) {
        super(name, birthDate, endDate);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = 0;
    }

    public void addHours(int hours) { this.hoursWorked += hours; }

    @Override
    public double collectPay() {
        if (isRetired()) return 0.0;
        double payment = hourlyRate * hoursWorked;
        hoursWorked = 0;
        return payment;
    }

    @Override
    public String toString() {
        return super.toString() + ", hourlyRate=" + hourlyRate + ", hoursWorked=" + hoursWorked;
    }
}
