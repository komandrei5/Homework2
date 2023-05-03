package task_03;

public class DepositCalculator {
    public static void main(String[] args) {
        double yearlyInterest = 0.0;
        if (args.length < 3) {
            System.out.println("Not correct !");
            return;
        }
        int depositAmount = Integer.parseInt(args[0]);
        double annualInterestRate = Double.parseDouble(args[1]);
        int depositDurationInYears = Integer.parseInt(args[2]);

        double monthlyInterestRate = annualInterestRate / 12.0 / 100.0;
        int numMonths = depositDurationInYears * 12;

        double balance = depositAmount;
        for (int i = 1; i <= numMonths; i++) {

            double interest = balance * monthlyInterestRate;
            balance += interest;
            yearlyInterest += interest;

            if (i % 12 == 0) {
                System.out.printf("Year %d, Balance = %.2f, Interest = %.2f%n", i / 12, balance, yearlyInterest);
                yearlyInterest = 0.0;
            }
        }
    }
}
