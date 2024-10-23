package org.lbg.unreachable;

public class UnreachableMain
{
    public static void main(String[] args)
    {
        System.out.println("UnreachableMain");
    }

    public void fooBar()
    {
        ClassB cb = new ClassB();

        cb.age = 1;
    }
}
