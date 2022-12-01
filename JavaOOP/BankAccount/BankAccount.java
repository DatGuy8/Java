import java.util.Random;

public class BankAccount {

    private double checkingBalance;
    private double savingsBalance;
    private long accountNumber;
    private static int numberOfAccounts = 0;
    private static int moneyInBank = 0;

    //constructor
    public BankAccount(double checkingBalance, double savingsBalance){
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        this.accountNumber = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
        numberOfAccounts++;
        moneyInBank += savingsBalance + checkingBalance;
    }

    //get accountnumber BONUS
    public long getAccountNumber(){
        return accountNumber;
    }

    //getter checking
    public double getCheckingBalance(){
        return checkingBalance;
    }

    //getter savings
    public double getSavingsBalance(){
        return savingsBalance;
    }

    
    public void depositIntoAccount(double deposit, String whichAccount){
        //check which account want to deposit too
        if(whichAccount.equals("Checking")){
            checkingBalance += deposit;
            System.out.printf("$%.2f deposited into Checking Account\n", deposit);
            System.out.println("New Checking Amount: $" + checkingBalance);
        }
        else {
            savingsBalance += deposit;
            System.out.printf("$%.2f deposited into Savings Account\n", deposit);
            System.out.println("New Savings Amount: $" + this.getSavingsBalance());

        }
    }

    
    public void withdrawFromAccount(double withdrawAmount, String whichAccount){

        if(whichAccount.equals("Checking") && withdrawAmount < this.getCheckingBalance()){
            checkingBalance -= withdrawAmount;
            System.out.printf("$%.2f withdrawn from Checking Account\n", withdrawAmount);
            System.out.printf("$%.2f left in Checking Account\n", this.getCheckingBalance());
        }
        else if(whichAccount.equals("Savings") && withdrawAmount < this.getSavingsBalance()){
            savingsBalance -= withdrawAmount;
            System.out.printf("$%.2f withdrawn from Savings Account\n", withdrawAmount);
            System.out.printf("$%.2f left in Savings Account\n", this.getSavingsBalance());
        }

        else {
            System.out.println("Insignificant Funds");
        }

    }

    public double accountsBalance(){
        // System.out.println("=======================");
        // System.out.println(moneyInBank);
        // System.out.println("=======================");
        return savingsBalance + checkingBalance;
    }

}