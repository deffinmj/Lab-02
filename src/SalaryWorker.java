public class SalaryWorker extends Worker {
    double annualSalary;

    public SalaryWorker() {
        super();
    }

    public SalaryWorker(String id, String firstName, String lastName, String title, int YOB, double salary) {
        super(id, firstName, lastName, title, YOB, 0);
        annualSalary = salary;
    }

    double calculateWeeklyPay(double hoursWorked) {
        return annualSalary/52;
    }

    String displayWeeklyPay(double hoursWorked) {
        double weeklyPay = calculateWeeklyPay(hoursWorked);
        System.out.println("Weekly pay of annual salary: " + Double.toString(weeklyPay));
        return Double.toString(weeklyPay);
    }
}
