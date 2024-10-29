package org.lbg.c4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasketTest {

    private Item item1;
    private Item item2;
    private Item item3;
    @BeforeEach
    public void createItemsForBasket()
    {
        item1 = new Item("Bananas", 6, 0.19); // 1.14
        item2 = new Item("Avocado", 3, 0.89); // 2.67
        item3 = new Item("Spinish", 1, 1.27); // 1.27

    }
    @Test
    void verify_total_cost_in_basket()
    {
        // arrange
        Basket old = new Basket();
        old.addItem(item1);
        old.addItem(item2);
        old.addItem(item3);
        double expectedResult = 5.08;
        Basket cut = new Basket(old);

        // act
        double actualResult = cut.getTotal();

        //assert
        assertEquals(expectedResult, actualResult, 2);

    }
}