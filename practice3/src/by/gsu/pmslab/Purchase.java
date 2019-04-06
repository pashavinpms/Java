package by.gsu.pmslab;

import java.util.Scanner;

public class Purchase {
    private String commodityName;
    private int price;
    private int numberOfUnits;

    public Purchase() {
        super();
    }

    public Purchase(String commodityName, int price, int numberOfUnits) {
        super();
        this.commodityName = commodityName;
        this.price = price;
        this.numberOfUnits = numberOfUnits;
    }

    public Purchase(Scanner sc) {
        this.commodityName = sc.next();
        this.price = sc.nextInt();
        this.numberOfUnits = sc.nextInt();
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumberOfUnits() {
        return numberOfUnits;
    }

    public void setNumberOfUnits(int numberOfUnits) {
        this.numberOfUnits = numberOfUnits;
    }

    public int getCost() {
        return price * numberOfUnits;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Purchase))
            return false;
        Purchase other = (Purchase) obj;
        if (commodityName == null) {
            if (other.commodityName != null)
                return false;
        } else if (!commodityName.equals(other.commodityName))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

    protected String fieldsToString () {
        return commodityName + ";" + price + ";" + numberOfUnits;
    }

    @Override
    public String toString() {
        return fieldsToString() + ";" + getCost();
    }
}
