package lesson9;

public class CardOwner implements Runnable{

    private CreditCard creditCard;
    private String name;

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CardOwner(CreditCard creditCard, String name) {
        this.creditCard = creditCard;
        this.name = name;
    }

    @Override
    public void run() {
        while(creditCard.isEnoughMoney()){
            try {
                creditCard.makeWithdraw(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
