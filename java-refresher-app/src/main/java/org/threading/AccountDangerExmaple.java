package org.threading;

/**
 * Created by kulkamah on 2/21/2017.
 */
public class AccountDangerExmaple implements Runnable {
    private Account acct = new Account(50);

    public static void main(String[] args) {
        AccountDangerExmaple r = new AccountDangerExmaple();
        Thread one = new Thread(r);
        Thread two = new Thread(r);
        one.setName("Fred");
        two.setName("Lucy");

        one.start();
        two.start();
    }


    public void run() {
        for (int x = 0; x < 5; x++) {
            makeWithdrawal(10);
            if (acct.getBalance() < 0) {
                System.out.println("account is overdrawn!");
            }
        }
    }

    public synchronized void makeWithdrawal(int amt) {
        if (acct.getBalance() >= amt) {
            System.out.println(Thread.currentThread().getName()
                    + " is going to withdraw");
            try {
                Thread.sleep(500);
            } catch(InterruptedException ex) {

            }
            acct.withdraw(amt);
            System.out.println(Thread.currentThread().getName()
                    + " completes the withdrawal");
        } else {
            System.out.println("Not enough in account for "
                    + Thread.currentThread().getName()
                    + " to withdraw " + acct.getBalance());
        }
    }

}


class Account {

    private int balance;

    Account(){

    }

    Account(final int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(final int balance) {
        this.balance = balance;
    }

    public void withdraw(final int amount) {
        this.balance = this.balance - amount;
    }

}