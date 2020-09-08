package lesson9;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        Runnable runnable = () -> {
//            for(int i = 0; i < 5; i++){
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(Thread.currentThread().getName() + " : " + i);
//            }
//        };
//        Thread thread1 = new Thread(runnable, "My Thread 1");
//        Thread thread2 = new Thread(runnable, "My Thread 2");
//        Thread thread3 = new Thread(runnable, "My Thread 3");
//
//        thread1.start();
//        thread1.join();
//        thread2.start();
//        thread2.join();
//        thread3.start();

        BankAccount bankAccount = new BankAccount(50);
        CreditCard creditCard = new CreditCard(bankAccount);
        CardOwner husband = new CardOwner(creditCard, "Husband");
        CardOwner wife = new CardOwner(creditCard, "Wife");

        Thread threadHusband = new Thread(husband, husband.getName());
        Thread threadWife = new Thread(wife, wife.getName());

        threadHusband.start();
        threadWife.start();

        threadWife.join();
        threadHusband.join();

        System.out.println("Final amount: " + bankAccount.getSum());



    }
}
