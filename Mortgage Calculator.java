import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static void main(String[] args) {

        int principal = (int) readNumber("Principal: ", 10000, 1_000_000);
        float annualInterest = (float) readNumber("Annual Interest rate: ", 1, 30);
        byte years = (byte) readNumber("Period(Years): ", 1, 30);

        printMortgage(principal, annualInterest, years);
        //printPaymentSchedule(principal, annualInterest, years);
        printDetailedPaymentSchedule(principal, annualInterest, years);
    }

    private static void printDetailedPaymentSchedule(int principal, float annualInterest, byte years) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        System.out.printf("%-8s %-15s %-15s %-15s %-15s%n", "Month", "Payment", "Interest", "Principal", "Balance");

        double monthlyPayment = calculateMortgage(principal, annualInterest, years);
        double balance = principal;

        for (short month = 1; month <= years * MONTHS_IN_YEAR; month++) {
            double interest = balance * (annualInterest / PERCENT / MONTHS_IN_YEAR);
            double principalPaid = monthlyPayment - interest;
            balance -= principalPaid;

            if (balance < 0) balance = 0; // Avoid -0.00 at the end

            System.out.printf("%-8d %-15s %-15s %-15s %-15s%n",
                    month,
                    NumberFormat.getCurrencyInstance().format(monthlyPayment),
                    NumberFormat.getCurrencyInstance().format(interest),
                    NumberFormat.getCurrencyInstance().format(principalPaid),
                    NumberFormat.getCurrencyInstance().format(balance)
            );
        }
    }

    private static void printMortgage(int principal, float annualInterest, byte years) {
        double mortgage = calculateMortgage(principal, annualInterest, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: "+mortgageFormatted);
    }

    private static void printPaymentSchedule(int principal,float annualInterest,byte years) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for(short month = 1; month <= years *MONTHS_IN_YEAR; month++){
            double balance = calculateBalance(principal, annualInterest, years, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }

    public static double readNumber(String prompt, double min, double max){
        Scanner scanner = new Scanner(System.in);
        double value;
        while(true){
            System.out.print(prompt);
            value = scanner.nextFloat();
            if(value >= min && value <=max)
                break;
            System.out.println("Enter a value between "+min+" and "+max);
        }
        return value;

    }

    public static double calculateMortgage(int principal, float annualInterest, byte years){

        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        short numberOfPayments = (short)(years * MONTHS_IN_YEAR);

        // Mortgage formula: M = P[r(1+r)^n] / [(1+r)^n – 1]
        // P = principal, r = monthly interest rate, n = total number of payments

        double mortgage = principal * (monthlyInterest * Math.pow(1+monthlyInterest, numberOfPayments))
                                    / (Math.pow(1+monthlyInterest, numberOfPayments) - 1);

        return mortgage;
    }

    public static double calculateBalance(int principal, float annualInterest, byte years, short numberOfPaymentsMade) {

        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        short numberOfPayments = (short)(years * MONTHS_IN_YEAR);

        double balance = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return balance;
    }
}
