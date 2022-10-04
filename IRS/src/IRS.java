import java.util.Scanner;
//=============================================================================
public class IRS {
//-----------------------------------------------------------------------------
    private static final Scanner keyboard = new Scanner(System.in);
//----- Declaring tax rates for each group as a static variable
    private static final double SQ_TAX = .25;
    private static final double M_TAX = .10;
    private static final double AR_TAX = .03;
    private static final double P_TAX = 0.0;
//-----------------------------------------------------------------------------
    public static void main(String[] args) {
//----- Declaring variables
        double income, deduction, input, taxIncome, taxOwed;
        char taxGroup;

        deduction = 0;
        income = 0;
//----- Getting user input
        System.out.println("Enter income or deductions. When finished, enter 0.");

        do {

            System.out.println("Enter next amount : ");
            input = keyboard.nextDouble();

            if (input > 0) {
                income = income + input;
            } else {
                deduction = deduction + input;
            }

        } while (input != 0);

//----- taxableIncome calculates the taxable income

        taxIncome = taxableIncome(income, deduction);

//----- calcTaxGroup calculates the tax group based on taxable income

        taxGroup = calcTaxGroup(taxIncome);

//----- calcTaxOwed calculates the tax owed based on the group and taxable income

        taxOwed = calcTaxOwed(taxGroup, taxIncome);

//----- Displaying output to user

        System.out.println("Total income: $" + income);
        System.out.println();
        System.out.println("Deductions: $" + (deduction * -1));
        System.out.println();
        System.out.println("Taxable income: $" + taxIncome);
        System.out.println();
        System.out.println("Tax group : " + taxGroup);
        System.out.println();
        System.out.println("Tax owed: $" + taxOwed);

    }
//-----------------------------------------------------------------------------
    private static double taxableIncome(double income, double deduction) {

        double taxIncome;

        taxIncome = income + deduction;
//----- Makes sure that taxable income can't be negative
        if (taxIncome < 0) {
            taxIncome = 0;
        }

        return(taxIncome);
    }
//-----------------------------------------------------------------------------
    private static char calcTaxGroup(double taxIncome) {

        char taxGroup;

        if (taxIncome >= 500000) {
            taxGroup = 'S';
        }
        else if (taxIncome >= 200000) {
            taxGroup = 'Q';
        }
        else if (taxIncome >= 100000) {
            taxGroup = 'M';
        }
        else if (taxIncome >= 50000) {
            taxGroup = 'A';
        }
        else if (taxIncome >= 20000) {
            taxGroup = 'R';
        } else {
            taxGroup = 'P';
        }
        return (taxGroup);
    }
//-----------------------------------------------------------------------------
    private static double calcTaxOwed(char taxGroup, double taxIncome) {

        double taxOwed, taxRate;

        taxRate = 0;

        switch (taxGroup) {

            case 'S':
            case 'Q':
                taxRate = SQ_TAX;
                break;
            case 'M':
                taxRate = M_TAX;
                break;
            case 'A':
            case 'R':
                taxRate = AR_TAX;
                break;
            case 'P':
                taxRate = P_TAX;
                break;
            default:
                System.out.println("Error in tax bracket calculation.");
                break;

        }
        taxOwed = taxIncome * taxRate;
        System.out.println(taxRate);
        return(taxOwed);
    }
//----------------------------------------------------------------------------
}
