import java.util.Random;

public class BankAccountTest{

    public static void main(String[] args){

        BankAccount johnsAccount = new BankAccount(9000, 324900);
        BankAccount billysAccount = new BankAccount(5555000, 0);

        System.out.println(johnsAccount.getCheckingBalance());
        johnsAccount.depositIntoAccount(3000, "Checking");
        johnsAccount.withdrawFromAccount(14000, "Checking");

        System.out.println("Total Amount in Both Accounts: $" + johnsAccount.accountsBalance());
        
        //ACCOUNT NUMBERS
        System.out.println(johnsAccount.getAccountNumber());
        System.out.println(billysAccount.getAccountNumber());

    }

}