package org.lbg.c4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    public  void    onConstruction_verify_object_initialised_correctly()
    {
        // arrange
        double expectedResult = 34.75;
        BankAccount cut = new BankAccount(expectedResult);


        //  act
        double actualResult = cut.getBalance();

        // assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public  void    onCredit_balance_increased_by_amount()
    {
        // arrange
        double openingBalance = 34.75;
        BankAccount cut = new BankAccount(openingBalance);
        double expectedResult = 39.75;

        // act
        cut.credit(5);
        double actualResult = cut.getBalance();

        // assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public  void    onDebit_balance_decreased_by_amount() {


        // arrange
        double openingBalance = 34.75;
        BankAccount cut = new BankAccount(openingBalance);
        double expectedResult = 33.75;

        // act
        cut.debit(1);
        double actualResult = cut.getBalance();

        // assert
        assertEquals(expectedResult, actualResult);

    }

}
