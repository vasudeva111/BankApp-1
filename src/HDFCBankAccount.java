public class HDFCBankAccount implements BankAccount{

private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public HDFCBankAccount(int balance) {
        this.balance = balance;
    }


    @Override
    public Boolean withrawMoney(int money) {
            if(this.balance >= money){
                this.balance = this.balance-money;
                return true;

            }
            return false;
    }
}



