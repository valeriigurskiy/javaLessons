package lesson9;

public class CreditCard {

    private volatile BankAccount bankAccount;
    private boolean isEnoughMoney;

    public CreditCard(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        this.isEnoughMoney = true;
    }

    public void makeWithdraw(int amountToWithdraw) throws InterruptedException {
        synchronized (bankAccount) {
            if (bankAccount.getSum() >= amountToWithdraw) {
                System.out.println(Thread.currentThread().getName() + " is withdrawing money");
                Thread.sleep(500);
                bankAccount.withdraw(amountToWithdraw);
                System.out.println(Thread.currentThread().getName() + " has withdrawn money, " +
                        "remains on account: " + bankAccount.getSum());
            } else {
                this.isEnoughMoney = false;
            }
        }
    }

    public boolean isEnoughMoney(){
        return isEnoughMoney;
    }

}
