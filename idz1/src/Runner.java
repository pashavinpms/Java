import by.gsu.pmslab.Stock;

import java.util.Arrays;
import java.util.Comparator;

public class Runner {
    public static void main (String args[]){
        Stock[] stocks = {
                new Stock("Beaf",15,true),
                new Stock("Egg",4,true),
                new Stock("Dog",19,true),
                new Stock("Pepper",3,true),
                new Stock("Oil",5,false),
                new Stock("Apple",1,false),
                new Stock("Banana",2,true),
                new Stock("Tomato",4,true),
                new Stock("Minigun",9999,false),
                new Stock("Solaris",15499,true),
        };
        System.out.println("Array: \n");
        for (Stock i : stocks){
            System.out.println(i);
        }
        System.out.println("\n---------------------------\n");
    int sum = 0;
        for (Stock i : stocks) {
            if (i.isExistence()){
                sum++;
            }
        }
    System.out.println("Existance: "+sum);
    int sale = 0;
        for (Stock i : stocks){
            if(i.isExistence()) {
                sale += i.getPrice();
            }
        }
    System.out.println("\n---------------------------\n");
    System.out.println("Summary price: "+sale);
    System.out.println("\n---------------------------\n");
    System.out.println("Sorting by price: \n");
    Arrays.sort(stocks,new Comparator<Stock>(){
        public int compare(Stock o1, Stock o2){
            return o1.getPrice()-o2.getPrice();
        }
    });
    for (Stock i : stocks) {
        System.out.println(i);
    }
    System.out.println("\n---------------------------\n");
        System.out.println("Sorting by name: \n");
    Arrays.sort(stocks,new Comparator<Stock>(){
        public int compare(Stock o1, Stock o2){
            return o1.getName().compareTo(o2.getName());
        }
    });
    for (Stock i : stocks) {
        System.out.println(i);
    }
    }
}
