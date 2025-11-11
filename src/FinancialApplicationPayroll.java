import java.util.Scanner;

public class FinancialApplicationPayroll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for name, hours worked, pay rate, federal tax and, state tax
        System.out.print("Enter First name and last name: ");
        String fullName = input.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        double hourWorked = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double hourlyPay = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double federalTax = input.nextDouble();
        System.out.print("Enter the state tax withholding rate: ");
        double stateTax = input.nextDouble();

        // Extracting first name and last name
        int k = fullName.indexOf(" ");
        String firstName = fullName.substring(0, k);
        String lastName = fullName.substring(k + 1);

        // Gross pay
        double grossPay = hourWorked * hourlyPay;

        // Federal and state withholding
        double federalTax1 = grossPay * federalTax;
        double stateTax1 = grossPay * stateTax;
        double totalTax = federalTax1 + stateTax1;

        // Net pay
        double netPay = grossPay - totalTax;

        // Display
        System.out.printf("%nEmployee Details%nFirst Name: %s%nLast Name: %s%n", firstName, lastName);
        System.out.printf("Hours Worked: %.1f%nPay Rate: $%.2f%nGross Pay: $%.2f%n", hourWorked, hourlyPay, grossPay);
        System.out.printf("Deductions:%n\tFederal Withholding (%.1f%%): $%.2f%n\tState Withholding (%.1f%%): $% .2f%n\tTotal Deduction: $%.2f%n", federalTax * 100, federalTax1, stateTax * 100, stateTax1, totalTax);
        System.out.printf("Net Pay: $%.2f", netPay);
    }
}
