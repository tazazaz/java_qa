package org.lbg.c4;

public class BankAccount {

    private double itsBalance;

    public BankAccount(double openingBalance)

    {
        itsBalance = openingBalance;
    }

    public double getBalance()
    {
        return itsBalance;
    }


    public void credit(double amount) {
        if (amount > 0) {
            itsBalance += amount;
        }
    }

    public void debit(double amount) {
        {
            if( itsBalance - amount > 0 )
                itsBalance -= amount;
        }


    }

}
