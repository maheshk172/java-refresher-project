package org.threading;

/**
 * Created by kulkamah on 2/20/2017.
 */
public class CalculationsInThreads {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setBalance(100);

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c1);

        t1.setName("Danny");
        t2.setName("Lucy");

        t1.start();
        t2.start();
    }
}

class Calculator implements Runnable {
    int balance = 0;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void run() {
        this.balance = this.balance + 10;
        System.out.println("Cusotmer : " + Thread.currentThread().getName() + ",  Adding 10 to balance, balance is : " + balance );

        this.balance = this.balance - 20;
        System.out.println("Cusotmer : " + Thread.currentThread().getName() + ",  subtracting 20 to balance, balance is : " + balance) ;


        this.balance = this.balance + 100;
        System.out.println("Cusotmer : " + Thread.currentThread().getName() + ",  Adding 100 again to balance, balance is : " + balance);
    }
}

