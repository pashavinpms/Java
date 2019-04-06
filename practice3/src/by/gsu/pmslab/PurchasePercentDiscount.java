package by.gsu.pmslab;

import java.util.Scanner;

public class PurchasePercentDiscount extends Purchase {
    private double percent;
    private final int NECESSARY_NUMBER = 15;

    public PurchasePercentDiscount() {
        super();
    }

    public PurchasePercentDiscount(String commodityName, int price, int numberOfUnits, double percent) {
        super(commodityName, price, numberOfUnits);
        this.percent = percent;
    }

    public PurchasePercentDiscount(Scanner sc) {
        super(sc);
        this.percent = sc.nextDouble();
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public int getCost() {
        if (getNumberOfUnits()> NECESSARY_NUMBER) {
            return (int)(super.getCost() * (1 - percent/100));
        } else {
            return super.getCost();
        }
    }

    protected String fieldsToString() {
        return  super.fieldsToString() + ";" + percent;
    }
}
