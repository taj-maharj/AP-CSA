package inheritance.bankaccounts;

public class SpecialCheckingAccount extends CheckingAccount{
    private double minimumBalance;
    private double interestRate;

    public SpecialCheckingAccount(int idNumber, double startBal, double cc, double intR, double minB){
        super(idNumber, startBal, cc);
        minimumBalance = minB;
        interestRate = intR;
    }
    @Override
    public void clearCheck(double amount) {
        if (currentBalance()>minimumBalance) decreaseBalance(amount);
        else super.clearCheck(amount);
    }

    @Override
    public double monthlyInterest() {
        if (currentBalance()>minimumBalance) return currentBalance()*interestRate/12d;
        return 1.0;
    }
}
