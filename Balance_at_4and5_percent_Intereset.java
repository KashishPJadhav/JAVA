class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;

    SavingsAccount(double a) {
        this.savingsBalance = a;
    }

    public void modifyInterestRate(double a) {
        annualInterestRate = a;
    }

    public void setbal(double a) {
        this.savingsBalance = a;
    }

    public double getrate() {
        return annualInterestRate;
    }

    public double getbal() {
        return savingsBalance;
    }

    public void calculateMonthlyInterest() {
        double mi = (savingsBalance * annualInterestRate) / 12;
        System.out.println("Monthly Interest is : " + mi);
        savingsBalance += mi;
    }
}

public class Balance_at_4and5_percent_Intereset {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(2000);
        SavingsAccount s2 = new SavingsAccount(3000);
        s.modifyInterestRate(0.04);
        s2.modifyInterestRate(0.04);
        s.calculateMonthlyInterest();
        s2.calculateMonthlyInterest();
        System.out.println("Balance of Saver 1 at 4% Annual Interest Rate  : " + s.getbal());
        System.out.println("Balance of Saver 2 at 4% Annual Interest Rate  : " + s2.getbal());
        s.modifyInterestRate(0.05);
        s2.modifyInterestRate(0.05);
        s.calculateMonthlyInterest();
        s2.calculateMonthlyInterest();
        System.out.println("Balance of Saver 1 at 5% Annual Interest Rate  : " + s.getbal());
        System.out.println("Balance of Saver 2 at 5% Annual Interest Rate  : " + s2.getbal());
    }
}
