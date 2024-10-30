package org.lbg.c4;

import java.util.ArrayList;

public class Basket {

    private ArrayList<Item> itsItems = new ArrayList<>();

    public Basket(Basket other)
    {
        itsItems = new ArrayList(other.itsItems);
    }

    public Basket(){

    }
    public void addItem( Item item )
    {
        itsItems.add( item );
    }

    public double   getTotal()
    {
        double total = 0;

        for( Item item : itsItems )
        {
            total += item.getTotalPrice();
        }
        return total;
    }

}
