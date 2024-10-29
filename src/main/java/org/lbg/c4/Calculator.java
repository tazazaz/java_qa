package org.lbg.c4;

public class Calculator {
    public double total;

    public Calculator(double expectedResult) {
        this.total = 0.0;
    }

    public double getTotal() {
        return total;
    }


    public void add(double number) {
        total += number;
        // total = total + number
    }

    public void subtract(double number) {
        total -= number;
    }

    public void division(double number) {
        total /= number;
    }

    public void multiply(double number) {
        total *= number;
    }


}
