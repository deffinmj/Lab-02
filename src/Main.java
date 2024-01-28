import java.util.ArrayList;

public class Main {

    public static void main(String args[]) {
        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(new Worker("01", "Bob", "Dave", "Mr", 1979, 20));
        workers.add(new Worker("01", "Fake", "Joe", "Mr", 1979, 25));
        workers.add(new Worker("01", "Joe", "Dirt", "Mr", 1979, 30));
        workers.add(new SalaryWorker("01", "Jacob", "Clemons", "Mr", 1979, 50000));
        workers.add(new SalaryWorker("01", "Matt", "Matthews", "Mr", 1979, 60000));
        workers.add(new SalaryWorker("01", "Abe", "Belfort", "Mr", 1979, 70000));


        System.out.println("Simulating week 1 pay at 40 hours");
        PrintWeeklyPay(workers, 40);
        System.out.println("");
        System.out.println("Simulating week 2 pay at 50 hours");
        PrintWeeklyPay(workers, 50);
        System.out.println("");
        System.out.println("Simulating week 3 pay at 40 hours");
        PrintWeeklyPay(workers, 40);
        System.out.println("");
    }

    public static void PrintWeeklyPay(ArrayList<Worker> workers, int numberOfHours) {
        for(int i = 0; i < workers.size(); i++) {
            Worker w = workers.get(i);
            System.out.println("Weekly pay for " + w.firstName + " " + w.lastName + ": " + Double.toString(w.calculateWeeklyPay(numberOfHours)));
        }
    }

}
