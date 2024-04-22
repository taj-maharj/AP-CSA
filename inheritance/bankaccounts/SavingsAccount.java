package inheritance.bankaccounts;

public class SavingsAccount extends Account{
    private double annualInterest;
    public SavingsAccount(int id, double startBal, double annualInt){
        super(id, startBal);
        annualInterest = annualInt;
    }

    public double monthlyInterest(){
        return currentBalance()*annualInterest/12d;
    }

    public void withdraw(double withdrawnMoney){
        if(currentBalance()>=withdrawnMoney) decreaseBalance(withdrawnMoney);
    }
}
