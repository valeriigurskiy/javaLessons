package lesson9;

public class BankAccount {
    private volatile int sum;

    public int getSum(){
        return sum;
    }

    public BankAccount(int sum) {
        this.sum = sum;
    }

    public int withdraw(int amountTowithDraw){
        return this.sum-= amountTowithDraw;
    }

}
