package in.rsmharsha;

import java.text.NumberFormat;

public class MortgageReport {

    private final NumberFormat currency;
    private MortgageCalculator calculator;
    private final byte MONTHS_IN_YEAR = 12;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
        currency = NumberFormat.getCurrencyInstance();
    }

    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();
        String mortgageFormatted = currency.format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");

        for (double balance : calculator.getRemainingBalances()){
            System.out.println(currency.format(balance));
        }
    }

    public void printDetailedPaymentSchedule() {
        System.out.println();
        System.out.println("DETAILED PAYMENT SCHEDULE");
        System.out.println("-------------------------");

        // Use calculator-provided values only (no math in the report)
        double monthlyPayment = calculator.calculateMortgage();
        double[] balances = calculator.getRemainingBalances();

        System.out.printf("%-6s %-14s %-14s %-14s %-14s%n",
                "Month", "Payment", "Interest", "Principal", "Balance");

        double prevBalance = calculator.getPrincipal(); // balance before first payment

        for (int i = 0; i < balances.length; i++) {
            int month = i + 1;
            double currBalance   = balances[i];
            double principalPaid = prevBalance - currBalance;
            double interestPaid  = monthlyPayment - principalPaid;

            // Clamp tiny negatives on the last row due to rounding
            if (currBalance < 0 && currBalance > -0.01) currBalance = 0;

            System.out.printf("%-6d %-14s %-14s %-14s %-14s%n",
                    month,
                    currency.format(monthlyPayment),
                    currency.format(interestPaid),
                    currency.format(principalPaid),
                    currency.format(currBalance));

            prevBalance = currBalance;
        }
    }



}
