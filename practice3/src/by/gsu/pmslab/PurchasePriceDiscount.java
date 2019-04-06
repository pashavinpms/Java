package by.gsu.pmslab;
import java.util.Scanner;

public class PurchasePriceDiscount extends Purchase {
    private int priceDiscount;

    public PurchasePriceDiscount() {
        super();
    }

    public PurchasePriceDiscount(String commodityName, int price, int numberOfUnits, int priceDiscount) {
        super(commodityName, price, numberOfUnits);
        this.priceDiscount = priceDiscount;
    }

    public PurchasePriceDiscount(Scanner sc){
        super(sc);
        this.priceDiscount = sc.nextInt();
    }

    public double getDiscount() {
        return priceDiscount;
    }

    public void setDiscount(int priceDiscount) {
        this.priceDiscount = priceDiscount;
    }

    public int getCost() {
        return (super.getCost() - priceDiscount) * getNumberOfUnits();
    }

    protected String fieldsToString() {
        return  super.fieldsToString() + ";" + priceDiscount;
    }
}
