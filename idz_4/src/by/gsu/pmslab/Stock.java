package by.gsu.pmslab;

import java.io.Serializable;

public class Stock implements Serializable {
    private String nameOfProduct;
    private int cost;
    private boolean prodInStock;

    public Stock(String nameOfProduct, int cost, boolean prodInStock) {
        this.nameOfProduct = nameOfProduct;
        this.cost = cost;
        this.prodInStock = prodInStock;
    }

    public Stock (String nameOfProduct, int cost) {
        this(nameOfProduct,cost,true);
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean isProdInStock() {
        return prodInStock;
    }

    public void setProdInStock(boolean prodInStock) {
        this.prodInStock = prodInStock;
    }

    @Override
    public String toString() {
        return nameOfProduct + ";" + cost + ";" + prodInStock + ";";
    }
}
