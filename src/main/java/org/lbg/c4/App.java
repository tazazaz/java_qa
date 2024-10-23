package org.lbg.c4;


import java.io.IOException;

/**
 * Hello world!
 */
public class App
{
    public static void main(String[] args)
    {
        int counter = 0;
        int val;

        try

        {
            while ((val = (char)System.in.read()) != -1)

            {
                System.out.println("Character entered: " + val);
                counter++;
            }
            System.out.println("No of chars: " + counter);
        }catch (IOException e)

        {
            System.out.println(e);
        }


    }
}
