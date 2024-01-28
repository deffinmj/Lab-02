public class Worker extends Person {
    double hourlyPayRate;

    public Worker() {
        super();
    }

    public Worker(String id, String firstName, String lastName, String title, int YOB, double hourlyPayRate) {
        super(id, firstName, lastName, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    double calculateWeeklyPay(double hoursWorked) {
        if(hoursWorked > 40) {
            return (hourlyPayRate * 40) + ((hourlyPayRate * 1.5) * (hoursWorked - 40));
        } else {
            return hourlyPayRate * hoursWorked;
        }
    }

    String displayWeeklyPay(double hoursWorked) {
        double regularPay = 0;
        double overtimePay = 0;
        if(hoursWorked > 40) {
            regularPay = hourlyPayRate * 40;
            overtimePay = (hourlyPayRate * 1.5) * (hoursWorked - 40);
        } else {
            regularPay = hourlyPayRate * hoursWorked;
        }
        double totalPay = regularPay + overtimePay;
        System.out.println("Regular Pay: " + Double.toString(regularPay));
        System.out.println("Overtime Pay: " + Double.toString(overtimePay));
        System.out.println("Total Pay: " + Double.toString(totalPay));
        return Double.toString(totalPay);
    }
}
