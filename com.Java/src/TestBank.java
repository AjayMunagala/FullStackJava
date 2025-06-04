public class TestBank {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.setAccountNumber(1111);
        b1.setBalance(5000);
        b1.deposit(2000);
        b1.withdraw(2000);
        b1.currrentBalance();
        BankAccount source = new BankAccount();
        source.setAccountNumber(1001);
        source.setBalance(2000);
        System.out.println();
        

        BankAccount destination =new BankAccount();
        destination.setAccountNumber(1002);
        destination.setBalance(200);
       

        BankAccount.transfer(source,destination,110);
        source.currrentBalance();
        destination.currrentBalance();


    }
    
}
