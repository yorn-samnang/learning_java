import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        Worker jame = new Worker("Jame", "1990-01-01", "2025-12-31");
        SalariedEmployee jameSalaried = new SalariedEmployee("Jame", "1990-01-01", "2020-12-31", 52000); // past endDate => retired
        HourlyEmployee jameHourly = new HourlyEmployee("Jame", "1990-01-01", "2025-12-31", 20);
        jameHourly.addHours(80); // Worked 80 hours

        System.out.println(jame);
        System.out.println("Jame's age: " + jame.getAge());
        System.out.println("Jame's bi-weekly pay: $" + jameSalaried.collectPay());
        System.out.println("Jame has retired? " + jameSalaried.isRetired());
    }
}

class Worker {
    private String name;
    private LocalDate birthDate;
    private LocalDate endDate; // last day employed (inclusive)

    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = LocalDate.parse(birthDate);
        this.endDate = LocalDate.parse(endDate);
    }

    public int getAge() {
        return Period.between(this.birthDate, LocalDate.now()).getYears();
    }

    /** Retired if endDate is today or in the past. */
    public boolean isRetired() {
        return endDate != null && !endDate.isAfter(LocalDate.now());
    }

    public double collectPay() { return 0.0; }

    /** Set the last day of employment. Also what retire() uses. */
    public void terminate(String endDate) { this.endDate = LocalDate.parse(endDate); }

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

class SalariedEmployee extends Worker {
    private double annualSalary;

    public SalariedEmployee(String name, String birthDate, String endDate, double annualSalary) {
        super(name, birthDate, endDate);
        this.annualSalary = annualSalary;
    }

    /** Convenience: retiring is just setting endDate. */
    public void retire(String retireDate) { terminate(retireDate); }

    @Override
    public double collectPay() {
        // No pay once retired
        return isRetired() ? 0.0 : annualSalary / 26.0; // bi-weekly
    }

    @Override
    public String toString() {
        return super.toString() + ", annualSalary=" + annualSalary;
    }
}

class HourlyEmployee extends Worker {
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
        if (isRetired()) return 0.0; // no pay after end date
        double payment = hourlyRate * hoursWorked;
        hoursWorked = 0; // reset after pay
        return payment;
    }

    @Override
    public String toString() {
        return super.toString() + ", hourlyRate=" + hourlyRate + ", hoursWorked=" + hoursWorked;
    }
}
