import by.gsu.pmslab.Stock;

import java.io.*;
import java.util.*;

public class Runner {
    public static void main(String[] args) {
        final int ARRAY = 5;
        final String PRODNAME = "prod.dat";

        Stock[] products = new Stock[ARRAY];

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(PRODNAME)); Scanner in = new Scanner(System.in)) {
            int i = 0;
            while (i < ARRAY) {
                try {

                    System.out.println("Input object params " +
                            "for example(name of product(press Enter);cost of product(press Enter); product in stock(press Enter);): ");
                    String nameOfProduct = in.next();
                    int cost = in.nextInt();
                    boolean prodInStock = in.nextBoolean();
                    oos.writeObject(new Stock(nameOfProduct, cost, prodInStock));
                    i++;
                }catch (InputMismatchException ex) {
                    System.out.println("Invalid data format, see example.");
                }
            }
        }catch (IOException ex) {
            ex.printStackTrace();
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PRODNAME))) {
            for (int i = 0; i < ARRAY; i++) {
                products[i] = (Stock) ois.readObject();
            }
        }catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        System.out.println("\n Init array: ");
        show(products);

        System.out.println("\n Cost: " + count(products));

        System.out.println("\n Product in Stock: "+ SumProdInStock(products));

    }

    private static void show(Stock[] array) {
        for (Stock item: array) {
            System.out.println(item);
        }
    }
    private static int count(Stock[] array) {
        int counter = 0;
        for (Stock item: array) {
            counter += item.getCost();
        }
        return counter;
    }
    private static int SumProdInStock(Stock[] array) {
        int sum = 0;
        for (Stock item: array) {
            if (item.isProdInStock()) {
                sum++;
            }
        }
        return sum;
    }
}