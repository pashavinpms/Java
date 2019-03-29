package by.gsu.pmslab;

public class Stock {
    private String name;
    private int price;
    private boolean existence;

    public Stock(String name, int price, boolean existance){
        this.name = name;
        this.price = price;
        this.existence = existance;
    }
    public Stock(String name, int price){
        this(name, price, true);
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public boolean isExistence() {
        return existence;
    }
    public void setExistence(boolean existence) {
        this.existence = existence;
    }
    @Override
    public String toString(){
        return name+"; "+price+"; "+existence+";";
    }
}
