package com.refresher.problems.multithreading;

import static sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl.ThreadStateMap.Byte0.runnable;

public class Threading1 {
    public static void main(String[] args) {
        BankAccount savingsAccount = new BankAccount();
        savingsAccount.setBalance(5000);

        //Creating Husband
        Husband husband = new Husband();
        husband.setBankAccount(savingsAccount);
        //Creating Wife
        Wife wife = new Wife();
        wife.setBankAccount(savingsAccount);

        Thread husbandThread = new Thread(husband);
        husbandThread.setName("Husband Thread");

        Thread wifeThread = new Thread(wife);
        wifeThread.setName("Wife Thread");

        wifeThread.start();
        husbandThread.start();
    }
}

class Husband implements Runnable {

    private BankAccount bankAccount;

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        try {

            while (true) {

                //Check balance
                double currentBalance = this.bankAccount.getBalance();
                System.out.println(Thread.currentThread().getName() + "=> Current Balance : " + currentBalance);
                //check if I have enough money to buy
                System.out.println(Thread.currentThread().getName() + "=> I want to pay 1000, check if I have more balance : " + this.bankAccount.checkBalanceMoreThan(1000));

                System.out.println(Thread.currentThread().getName() + "=>Sleeping for sometime....");
                Thread.sleep(1000);

                //pay
                System.out.println(Thread.currentThread().getName() + "=> Pay 1000 ..... ");
                double updatedBalance = this.bankAccount.pay(1000);
                System.out.println(Thread.currentThread().getName() + "=> Balance after paying 1000 ..... :" + updatedBalance);

                //check balance again
                updatedBalance = this.bankAccount.getBalance();
                System.out.println(Thread.currentThread().getName() + "=> Updated Balance : " + updatedBalance);


            }
        } catch(InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}

class Wife implements Runnable {

    private BankAccount bankAccount;

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        boolean shouldIContinue = true;
        try {
            while (shouldIContinue == true) {

                //Check balance
                double currentBalance = this.bankAccount.getBalance();
                System.out.println(Thread.currentThread().getName() + "=> Current Balance : " + currentBalance);
                //check if I have enough money to buy
                System.out.println(Thread.currentThread().getName() + "=> I want to pay 2000, check if I have more balance : " + this.bankAccount.checkBalanceMoreThan(1000));


                System.out.println(Thread.currentThread().getName() + "=>Sleeping for sometime....");
                Thread.sleep(1000);

                //pay
                System.out.println(Thread.currentThread().getName() + "=> Pay 2000 ..... ");
                double updatedBalance = this.bankAccount.pay(2000);
                System.out.println(Thread.currentThread().getName() + "=> Balance after paying 2000 ..... :" + updatedBalance);

                //check balance again
                updatedBalance = this.bankAccount.getBalance();
                System.out.println(Thread.currentThread().getName() + "=> Updated Balance : " + updatedBalance);



            }
        } catch(InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}

class BankAccount  {

    private double balance;
    private Lock lock  = new Lock();

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(final double balance) {
        /*synchronized (lock) {*/
            this.balance = balance;
        //}

    }

    public boolean checkBalanceMoreThan(double compareValue) {
       /* synchronized (lock) {*/
            boolean result = false;
            if (this.balance >= compareValue) {
                result = true;
            }
            return result;
        //}
    }

    public double pay(double amount) {
        synchronized (lock) {
            double currentBalance = this.getBalance();
            if (currentBalance > 0 && currentBalance > amount) {
                currentBalance = currentBalance - amount;
                this.setBalance(currentBalance);
            } else {
                System.out.println(Thread.currentThread().getName() + "=> Unable to pay, account has less money");
            }


            return this.getBalance();
        }
    }
}

class Lock {}


